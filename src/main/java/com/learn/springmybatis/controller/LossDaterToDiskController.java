package com.learn.springmybatis.controller;

import com.learn.springmybatis.entity.lossdetertorisk.authenticationModel.AuthenticationResponse;
import com.learn.springmybatis.entity.lossdetertorisk.requestModel.RiskManagement;
import com.learn.springmybatis.entity.lossdetertorisk.responseModel.ChildParts;
import com.learn.springmybatis.service.LossDaterToRiskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * com.learn.springmybatis.controller
 *
 * @Author wujiyao
 * @create 2021 2021/4/26 19:14
 */
@RestController
@RequestMapping("/risk")
@Slf4j
public class LossDaterToDiskController {

    @Resource
    private LossDaterToRiskService lossDaterToRiskService;

    @RequestMapping("/getRisk")
    public String getRiskManagement(@RequestParam("caseNo") String caseNo, @RequestParam("estimateNo") String estimateNo,
                                            @RequestParam("vinCode") String vinCode) {
        log.info("getRisk。。。。");
        String riskManagement = lossDaterToRiskService.getRiskListData(caseNo, estimateNo, vinCode);

        return "success";
    }

    @RequestMapping("/addChildPartsList")
    public List<ChildParts> addChildPartsList() {
        return lossDaterToRiskService.addChildPartsList();
    }

    @RequestMapping("/addDataVehicle")
    public void addDataVehicle() {
        lossDaterToRiskService.addDataVehicle();
    }

    @RequestMapping("/getTest")
    public String getTest() {
        return lossDaterToRiskService.getTest().toString();
    }

    @RequestMapping("/saveData")
    public String saveData() {
        return lossDaterToRiskService.saveData();
    }



}
