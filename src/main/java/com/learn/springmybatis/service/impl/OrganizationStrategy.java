package com.learn.springmybatis.service.impl;


import com.learn.springmybatis.entity.test.OrganizationEntity;
import com.learn.springmybatis.service.AccVideoGuideService;
import com.learn.springmybatis.service.EasyExcelStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author lvz
 * @date 2021/6/18
 */
@Slf4j
@Service
public class OrganizationStrategy implements EasyExcelStrategy {

    @Resource
    private AccVideoGuideService organizationService;

    @Override
    public void saveBatch(List<?> list) {
        log.info("执行插入");
        List<OrganizationEntity> lists = (List<OrganizationEntity>) list;
        organizationService.saveBatch(lists);
    }


}
