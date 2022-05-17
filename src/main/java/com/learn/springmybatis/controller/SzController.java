package com.learn.springmybatis.controller;

import com.learn.springmybatis.service.SignService;
import com.learn.springmybatis.utils.AmlCustomerNature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * \* KDA IntelliJ IDEA.
 * \* User: hi
 * \* Date: 2021/06/02
 * \* Time: 13:53
 * \
 */
@Slf4j
@RestController
@RequestMapping("/Sz")
public class SzController {

    @Resource
    private SignService service;

    @RequestMapping("/SzController")
    public String findSzRePushMsgByclaimNo(){
        return service.findSzRePushMsgByclaimNo();
    }

    @RequestMapping("/getCustomerNatureIdcardNo")
    @ResponseBody
    public AmlCustomerNature getCustomerNatureIdcardNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AmlCustomerNature customer=null;
        try{
            String idcardNo = request.getParameter("idcardNo");
            log.info("idcardNo----" + idcardNo);
            customer = service.getCustomerNatureIdcardNo(idcardNo);
        }catch (Exception e) {
            log.error(e.getMessage());
        }
        return customer;
    }
}
