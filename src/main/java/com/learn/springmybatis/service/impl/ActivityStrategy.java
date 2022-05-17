package com.learn.springmybatis.service.impl;


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
public class ActivityStrategy implements EasyExcelStrategy {

    @Override
    public void saveBatch(List<?> list) {

    }

  /*  @Resource
    private ActivityService activityService;


    @Override
    public void saveBatch(List<?> list) {
        log.info("执行插入");
        List<ActivityEntity> lists = (List<ActivityEntity>) list;
        activityService.saveBatch(lists);
    }*/
}
