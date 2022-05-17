package com.learn.springmybatis.controller;

import com.learn.springmybatis.service.JiangSuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.learn.springmybatis.controller
 *
 * @Author wujiyao
 * @create 2021 2021/5/21 19:35
 */
@RestController
@RequestMapping("/js")
public class JiangSuController {

    @Resource
    private JiangSuService jiangSuService;

    @RequestMapping("/insertXml")
    public String insertXml() {
        jiangSuService.insertJsClaimXml();
        return "success";
    }

    @RequestMapping("/insertXmlOr")
    public String insertXmlOr() {
        jiangSuService.insertJsMsgXmlOriginal();
        return "success";
    }

}
