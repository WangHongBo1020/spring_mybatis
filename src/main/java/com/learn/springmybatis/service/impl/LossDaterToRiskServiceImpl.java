package com.learn.springmybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.learn.springmybatis.entity.lossdetertorisk.authenticationModel.AuthenticationResponse;
import com.learn.springmybatis.entity.lossdetertorisk.requestModel.PartsInfo;
import com.learn.springmybatis.entity.lossdetertorisk.requestModel.RiskManagement;
import com.learn.springmybatis.entity.lossdetertorisk.responseModel.*;
import com.learn.springmybatis.exception.BusException;
import com.learn.springmybatis.mapper.LossDeterToRiskDao;
import com.learn.springmybatis.service.LossDaterToRiskService;
import com.learn.springmybatis.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * com.learn.springmybatis.service.impl
 *
 * @Author wujiyao
 * @create 2021 2021/4/26 19:12
 */
@Service
@Slf4j
public class LossDaterToRiskServiceImpl implements LossDaterToRiskService {

    @Resource
    private LossDeterToRiskDao lossDeterToRiskDao;

    @Override
    public String getRiskListData(String caseNo, String estimateNo, String vinCode) {
       /* RiskManagement riskManagement = lossDeterToRiskDao.getRiskManagementData(caseNo, estimateNo );
        List<PartsInfo> partsInfoList = lossDeterToRiskDao.getPartsInfoList(estimateNo);
        riskManagement.setPartsInfo(partsInfoList);*/
        JSONObject object = new JSONObject();
        object.put("caseNo", caseNo);
        object.put("estimateNo", estimateNo);
        object.put("vinCode", vinCode);
        return dealLossToRiskMessage(object);
    }

    @Override
    public List<PartsInfo> getPartsInfoList(String estimateNo) {
        return null;
    }

    @Override
    public boolean sendAiRisk(String caseNo, String estimateNo) {
        return false;
    }

    @Override
    public List<ChildParts> addChildPartsList() {

        List<ChildParts> childPartsList = new ArrayList<>();
        ChildParts c1 = new ChildParts();
        c1.setStandardPartNo(getUUIDString());
        c1.setReqId(getUUIDString());
        childPartsList.add(c1);

        ChildParts c2 = new ChildParts();
        c2.setStandardPartNo(getUUIDString());
        c2.setReqId(getUUIDString());
        childPartsList.add(c2);
        return childPartsList;
    }

    @Override
    public void addDataVehicle() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle v1 = new Vehicle();
        v1.setId(getUUIDString());
        v1.setDataId(getUUIDString());
        v1.setVehicleChn("asdfg");

        Vehicle v2 = new Vehicle();
        v2.setId(getUUIDString());
        v2.setDataId(getUUIDString());
        v2.setVehicleChn("asdfg");

        vehicles.add(v1);
        vehicles.add(v2);
        lossDeterToRiskDao.insertAiResponseDataVehicle(vehicles);
    }

    @Override
    public  Map<String, String>  getTest() {
        return lossDeterToRiskDao.getTest();
    }

    @Override
    public String saveData() {
        Data data = new Data();
        data.setCaseno("C065105282020802445");
        data.setEstimateno(10234054L);
        data.setId(getUUIDString());
        lossDeterToRiskDao.insertAiResponseData(data);
        return "success";
    }

    public String dealLossToRiskMessage(JSONObject object) {
        String caseNo = object.get("caseNo").toString();//报案号
        String estimateNo = object.get("estimateNo").toString();
        String vinCode = object.get("vinCode").toString();
        //language=JSON
        String msg = "";
        String status = "1";
        //1. 鉴权
        AuthenticationResponse authenticationData = getAuthenticationData();
        if(authenticationData==null) {
            throw new BusException("AI风控明觉鉴权失败...");
        }
        log.info("AI风控鉴权返回内容："+authenticationData.toString());
        if("0000".equals(authenticationData.getCode())) {
            //2. Vin 预处理
            JSONObject vinResult = getVinProData(object, authenticationData.getContent().getAccessToken(), vinCode);
            log.info("AI风控VIN预处理返回信息："+vinResult);
            if("0000".equals(vinResult.get("code"))) {
                //3. AI风控发送接口
                String dataId = getUUIDString();
                AiResponse aiResponse = sendPartRisk(dataId, caseNo, estimateNo, vinCode, authenticationData);
                //4. 保存返回结果到数据库
                if(aiResponse!=null && "0000".equals(aiResponse.getCode())) {
                    insertResultToData(dataId, aiResponse, estimateNo, caseNo);
                    status = "0";
                    msg = aiResponse.toString();
                }else {
                    log.info("Ai风控返回数据异常："+aiResponse);
                    msg = aiResponse.toString();
                }
            }else {
                log.info("AI风控VIN预处理返回失败：");
                msg = vinResult.toJSONString();
            }
        }else {//鉴权不通过返回：9002
            //鉴权失败处理 TODO...
            log.info("AI风控鉴权失败：");
            msg = authenticationData.toString();
        }
        addRequestMsg(caseNo, estimateNo, msg, status);
        return null;
    }

    private void addRequestMsg(String caseNo, String estimateNo, String msg, String status) {
        System.out.println("长度:"+msg.length());
        lossDeterToRiskDao.insertRequestMsg(getUUIDString(),caseNo, estimateNo, msg, status);
    }

    private JSONObject getVinProData(JSONObject json, String authorization, String vinCode) {

        String url = "https://web-uat.dataenlighten.com:7045/service/common/v3/vehicle/vinPreHandle";
        log.info("AI 预处理请求URL: "+url);
        String result = "{\n" +
                "  \"vinCode\": \"KNAFC526565427084\",\n" +
                "}";
        try{
            Map<String, String> headerMap = new HashMap<>();
            headerMap.put("Content-Type", "application/json");
            headerMap.put("Authorization", "Bearer "+authorization);
            result = HttpUtil.sendPostAiRisk(result,  url, 30000, 30000, headerMap);
        }catch (Exception e) {
            log.info("Vin 预处理失败："+result);
        }
        return JSON.parseObject(result);
    }

    private AuthenticationResponse getAuthenticationData() {
        JSONObject object = new JSONObject();
        object.put("BusinessID", "B2B0198");
        object.put("ClientID", "f267374f43b32c4ae8c4de7487e2249a");
        object.put("UserName", "阳光保险闪赔宝");
        object.put("PassWord", "f267374f43b32c4ae8c4de7487e2249a");
        String url = "https://api.dataenlighten.com:7045/oauth/logon";
        log.info("AI风控鉴权请求的url："+url);
        //TODO...
        String result = HttpUtil.sendPost(object.toJSONString(),  url, 30000, 30000);
        return JSON.parseObject(result, AuthenticationResponse.class);
    }

    private String getSendData(String dataId, String caseNo, String estimateNo, String vinCode, AuthenticationResponse authenticationData) {
        RiskManagement riskManagement = lossDeterToRiskDao.getRiskManagementData(caseNo, estimateNo);
        String result = "";
        if(riskManagement!=null) {
            List<PartsInfo> partsInfoList = lossDeterToRiskDao.getPartsInfoList(estimateNo);
            riskManagement.setCaseNo(caseNo);
            riskManagement.setPartsInfo(partsInfoList);
            riskManagement.setBussinessId(authenticationData.getBusinessId());
            riskManagement.setVinCode(riskManagement.getVinCode());
            riskManagement.setPageFlag(true);
            riskManagement.setQueryTime(parseUtilDate(new Date()));
            riskManagement.setStandardQueryId(dataId);
            return JSONObject.toJSON(riskManagement).toString();
        }else {
            addRequestMsg(caseNo, estimateNo, result, "2");
            return "";
        }
    }

    public static String parseUtilDate(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return df.format(date);
    }

    private AiResponse sendPartRisk(String dataId, String caseNo, String estimateNo, String vinCode, AuthenticationResponse authenticationData) {
        String sendData = getSendData(dataId, caseNo, estimateNo, vinCode, authenticationData);
        String url = "https://web-uat.dataenlighten.com:7045/service/customer/cic/risk/findPartRisk";
        log.info("AI风控请求的url: "+url);
        String result = "";
        try{
            Map<String, String> headerMap = new HashMap<>();
            headerMap.put("Content-Type", "application/json");
            headerMap.put("Authorization", "Bearer "+authenticationData.getContent().getAccessToken());
            result = HttpUtil.sendPostAiRisk(sendData,  url, 30000, 30000, headerMap);
            log.info("AI风控返回结果result:"+result);
        }catch (Exception e) {
            log.info("Vin 预处理失败："+result);
        }
        if(StringUtils.hasText(result)) {
            return JSON.parseObject(result, AiResponse.class);
        }
        return null;
    }

    public void insertResultToData(String dataId, AiResponse aiResponse, String estimateNo, String caseNo) {
        Data data = aiResponse.getData();
        if(data!=null) {
            data.setId(dataId);
            data.setEstimateno(Long.valueOf(estimateNo));
            data.setCaseno(caseNo);
            lossDeterToRiskDao.insertAiResponseData(data);
            if(!CollectionUtils.isEmpty(data.getVehicle())) {
                data.getVehicle().forEach(d -> {
                    d.setId(getUUIDString());
                    d.setDataId(dataId);
                    d.setAiYear(d.getYear());
                });
                lossDeterToRiskDao.insertAiResponseDataVehicle(data.getVehicle());
            }
            if(!CollectionUtils.isEmpty(data.getRepPartsInfo())) {
                dealAiResponseDataRepPartsInfo(data.getRepPartsInfo(), dataId);
            }
        }else {
            log.info("明觉AI风控返回数据异常..."+aiResponse);
        }

    }

    private void dealAiResponseDataRepPartsInfo(List<RepPartsInfo> repPartsInfoList, String dataId) {
        for (RepPartsInfo repPartsInfo : repPartsInfoList) {
            String repPartsInfoId = getUUIDString();
            repPartsInfo.setId(repPartsInfoId);
            repPartsInfo.setDataId(dataId);
            lossDeterToRiskDao.insertAiResponseDataRepPartsInfo(repPartsInfo);
            if(!CollectionUtils.isEmpty(repPartsInfo.getPartsInfo())) {
                for (PartInfo partInfo : repPartsInfo.getPartsInfo()) {
                    String partInfoId = getUUIDString();
                    partInfo.setId(partInfoId);
                    partInfo.setRepPartsInfoId(repPartsInfoId);
                    lossDeterToRiskDao.insertAiResponseDataRepPartsInfoPartInfo(partInfo);
                    if(!CollectionUtils.isEmpty(partInfo.getChildParts())) {
                        for (ChildParts childPart : partInfo.getChildParts()) {
                            childPart.setId(getUUIDString());
                            childPart.setPartInfoId(partInfoId);
                        }
                        lossDeterToRiskDao.insertAiResponseDataRepPartsInfoPartInfoChildParts(partInfo.getChildParts());
                    }
                }
            }
        }
    }

    public static String getUUIDString() {
        String id = UUID.randomUUID().toString();
        id = id.replace("-", "");
        return id;
    }



}
