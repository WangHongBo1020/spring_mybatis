package com.learn.springmybatis.controller;

import com.learn.springmybatis.entity.lossdetertorisk.responseModel.ChildParts;
import com.learn.springmybatis.service.LossDaterToRiskService;
import com.learn.springmybatis.service.OtherTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * com.learn.springmybatis.controller
 *
 * @Author wujiyao
 * @create 2021 2021/4/26 19:14
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class OtherTestController {

    @Resource
    private OtherTestService otherTestService;

    @RequestMapping("/hongBoTest")
    public String hongBoTest(String caseNo) {

        return otherTestService.hongBoTest(caseNo);
    }

    @RequestMapping("/redisStatus")
    public boolean redisStatus(String caseNo) {
        return otherTestService.redisStatus(caseNo);
    }

}
