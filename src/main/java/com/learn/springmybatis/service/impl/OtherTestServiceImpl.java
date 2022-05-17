package com.learn.springmybatis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.learn.springmybatis.entity.test.ClaimInfoVo;
import com.learn.springmybatis.entity.test.UnitCodeEnum;
import com.learn.springmybatis.mapper.LossDeterToRiskDao;
import com.learn.springmybatis.service.OtherTestService;
import com.learn.springmybatis.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * com.learn.springmybatis.service.impl
 *
 * @Author wujiyao
 * @create 2021 2021/5/13 16:29
 */
@Slf4j
@Service
public class OtherTestServiceImpl implements OtherTestService {

    @Resource
    private LossDeterToRiskDao lossDeterToRiskDao;

    @Override
    public String hongBoTest(String caseNo) {
        ClaimInfoVo claimInfoVo = lossDeterToRiskDao.hongBoTest(caseNo);
        Map<String, String> map = lossDeterToRiskDao.hongBoTestTwo(caseNo);
        JSONObject jsonResult = new JSONObject();
        String pushAddress = claimInfoVo.getDamagePlace();
        String[] address = pushAddress.split("-");
        jsonResult.put("caseno", caseNo);
        jsonResult.put("notifyman",claimInfoVo.getNotifyMan());
        jsonResult.put("driver", claimInfoVo.getDriver());
        jsonResult.put("damageProvince", UnitCodeEnum.getCode(map.get("unitCode")));
        jsonResult.put("gps_lon", "30.6");
        jsonResult.put("gps_lat", "25.7");
        jsonResult.put("fiveaddress", pushAddress);
        String jsons = JSONObject.toJSONString(jsonResult);
        log.info("开始给案件电话中心推送数据请求报文是：json:{},事故号:{}", jsons);
        log.info("开始给案件电话中心推送URL:http://10.8.200.84:7003/CCHttpService/servlet/bigData/ClaimBackTrackingCaseInfo,");
        String resultObject = null;
        try {
            resultObject = HttpUtil.httpRequest("http://10.8.200.84:7003/CCHttpService/servlet/bigData/ClaimBackTrackingCaseInfo", "POST", jsons, "UTF-8", 5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("调用案件电话中心推数据返回结果：报文:{},", resultObject);
        return null;
    }

    @Override
    public boolean redisStatus(String caseNo) {
        return lossDeterToRiskDao.getRedisStatus();
    }

}
