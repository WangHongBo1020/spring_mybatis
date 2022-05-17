package com.learn.springmybatis.controller;


import com.alibaba.fastjson.JSONObject;
import com.learn.springmybatis.entity.changjiu.*;

import com.learn.springmybatis.entity.test.TestUser;
import com.learn.springmybatis.entity.test.Testceshivo;
import com.learn.springmybatis.service.AccVideoGuideService;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/acc")
public class AccVideoGuideController {

    @Resource
    private AccVideoGuideService accVideoGuideService;

    @GetMapping("/accVideoGuideController")
    private String AccVideoGuideController(){
        String VIDEO_PATH = "http://1500000075.vod2.myqcloud.com/6c9771b4vodcq1500000075/4bca251e3701925923301486532/f0.mp4";
        return accVideoGuideService.getgetAcquisitionTime(VIDEO_PATH);
    }

    @GetMapping("/accVideoGuideControllers")
    private String gibaoanInfos(){
        String csaeNo = "C095705282021800111";
        return accVideoGuideService.getgibaoanInfos(csaeNo);
    }

    @GetMapping("/zhuanma")
    private String zhuanma(){
        String claimNo = "新车";
        return accVideoGuideService.getzhuanma(claimNo);
    }


    @GetMapping("/zhuanmas")
    private Result<Object, Testceshivo> zhuanmas(){
        String claimNo = "YC202111050001";
        Testccc ccc= new Testccc();
        ccc.setCode(claimNo);
        Page<Testceshivo> obj = accVideoGuideService.zhuanmas(ccc);
        return obj != null ? Result.succeed(obj) : Result.failed("数据不存在");
    }

    @GetMapping("/insertwmsgression")
    private Result insertwmsgression() throws ParseException {
        String claimNo = "YC202111050001";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date endTime  = sdf.parse("2022-01-07");
        String starTimes = sdf.format(new Date());
        Date starTime  = sdf.parse(starTimes);

        long day = 60*1000*60*24; // 1天
        System.out.println("endTime：" + JSONObject.toJSONString(endTime.getTime()));
        System.out.println("ay * 31：" + JSONObject.toJSONString(day * 31));
        System.out.println("endTime.getTime() - (day * 31)：" + JSONObject.toJSONString(endTime.getTime() - (day * 31)));
        System.out.println("starTime .getTime()：" + starTime .getTime());

        if (endTime.getTime() - (day * 31) > starTime .getTime()) {
            return Result.failed("数据不存在");
        }

        int obj = accVideoGuideService.insertwmsgression();
        return obj > 0 ? Result.succeed(obj) : Result.failed("数据不存在");
    }


    @GetMapping("/weihujihua")
    private Result<Object, Testceshivo> weihujihua(){
        String claimNo = "YC202111050001";
        Testccc ccc= new Testccc();
        ccc.setCode(claimNo);
        int count = accVideoGuideService.weigh();
        Page<Testceshivo> obj = accVideoGuideService.zhuanmas(ccc);
        return obj != null ? Result.succeed(obj) : Result.failed("数据不存在");
    }


    @GetMapping("/weihujihuachaxun")
    private Result<Object, Testceshivo> weihujihuachaxun(){

        WmsStockroomPreserveDetail obj = accVideoGuideService.weihujihuachaxun();
        return obj != null ? Result.succeed(obj) : Result.failed("数据不存在");
    }

    @GetMapping("/charu")
    private Result<Object, Testceshivo> charu() {
        List<String> stringList = new ArrayList<>();
        stringList.add("灯");
        stringList.add("大灯");
        stringList.add("小灯");
        stringList.add("后灯");
        stringList.add("前灯");
        String buwei = JSONObject.toJSONString(stringList);
        int count = stringList.size();
        int obj = accVideoGuideService.charu(buwei,count);
        return obj > 0 ? Result.succeed(obj) : Result.failed("数据不存在");
    }

    @GetMapping("/chongfushuju")
    private Result<Object, WmsStockroomMonthdiscspotFsDto> chongfushuju(){
        WmsStockroomMonthdiscspotFsDto obj = accVideoGuideService.chongfushuju();
        return obj != null ? Result.succeed(obj) : Result.failed("数据不存在");
    }

    @GetMapping("/tsestt")
    private Result<Object, WmsStockroomMonthdiscspotFsDto> stream(){
        List<TestUser> obj = accVideoGuideService.stream();
        return obj != null ? Result.succeed(obj) : Result.failed("数据不存在");
    }

}
