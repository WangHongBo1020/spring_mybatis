package com.learn.springmybatis.service;

import com.learn.springmybatis.entity.lossdetertorisk.requestModel.PartsInfo;
import com.learn.springmybatis.entity.lossdetertorisk.responseModel.ChildParts;

import java.util.List;
import java.util.Map;

/**
 * com.learn.springmybatis.service
 *
 * @Author wujiyao
 * @create 2021 2021/4/26 19:11
 */
public interface LossDaterToRiskService {

    String getRiskListData(String caseNo, String estimateNo, String vinCode);

    List<PartsInfo>  getPartsInfoList(String estimateNo);

    boolean sendAiRisk(String caseNo, String estimateNo);

    List<ChildParts> addChildPartsList();

    void addDataVehicle();

    Map<String, String> getTest();

    String saveData();

}
