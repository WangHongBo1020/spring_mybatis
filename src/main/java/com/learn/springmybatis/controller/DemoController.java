package com.learn.springmybatis.controller;

import com.alibaba.excel.EasyExcel;
import com.learn.springmybatis.entity.test.OrganizationEntity;
import com.learn.springmybatis.entity.test.UploadDataListener;
import com.learn.springmybatis.mapper.UploadInsertMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author lvz
 * @date 2021/6/9
 */
@RestController
@RequestMapping("/demo")
public class DemoController {


    @Resource
    private UploadInsertMapper uploadInsertMapper;


    /**
     * 文件上传
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link OrganizationEntity}
     * <p>
     * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link UploadDataListener}
     * <p>
     * 3. 直接读即可
     */
    @PostMapping("upload")
    @ResponseBody
    public String upload(@RequestParam(value = "file") MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), OrganizationEntity.class, new UploadDataListener<OrganizationEntity>(uploadInsertMapper)).sheet().doRead();
        return "success";
    }


    /*@PostMapping("test")
    @ResponseBody
    public ResultUtil<String> sqlTest()  {
        meetingMapper.sqlTest();
        return ResultUtil.resultOk();
    }*/

}
