package com.learn.springmybatis.mapper;

import com.learn.springmybatis.entity.jiangsu.JsRePushMsg;
import com.learn.springmybatis.entity.lossdetertorisk.requestModel.PartsInfo;
import com.learn.springmybatis.entity.lossdetertorisk.requestModel.RiskManagement;
import com.learn.springmybatis.entity.lossdetertorisk.responseModel.*;
import com.learn.springmybatis.entity.test.ClaimInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * com.sunshine.autoclaim.dao.lossdetertorisk
 *
 * @Author wujiyao
 * @create 2021 2021/4/23 21:31
 */
@Mapper
public interface LossDeterToRiskDao {

    RiskManagement getRiskManagementData(@Param("caseNo") String caseNo, @Param("estimateNo") String estimateNo);

    List<PartsInfo> getPartsInfoList(String estimateNo);

    void insertAiResponseData(Data data);

    void insertAiResponseDataRepPartsInfo(RepPartsInfo repPartsInfo);

    void insertAiResponseDataVehicle(List<Vehicle> vehicle);

    void insertAiResponseDataRepPartsInfoPartInfo(PartInfo partInfo);

    void insertAiResponseDataRepPartsInfoPartInfoChildParts(List<ChildParts> childParts);

    void insertInfoPartInfoChildParts(ChildParts childPart);

    void insertScoreByBatch(List<ChildParts> childPartsList);

    void insertRequestMsg(@Param("uuid") String uuid, @Param("caseNo") String caseNo,
                          @Param("estimateNo") String estimateNo,
                          @Param("msg") String msg, @Param("status") String status);

    Map<String, String> getTest();

    Map<String, String> hongBoTestTwo(String caseNo);

    ClaimInfoVo hongBoTest(String caseNo);

    void insertJsMsgXml(JsRePushMsg pushMsg);

    void insertJsMsgXmlOriginal(JsRePushMsg pushMsg);

    boolean getRedisStatus();

}
