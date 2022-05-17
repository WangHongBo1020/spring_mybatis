package com.learn.springmybatis.service;

import com.learn.springmybatis.entity.test.SpringUtils;

import org.springframework.stereotype.Component;

/**
 * @author lvz
 * @date 2021/6/21
 */
@Component
public class ExcelContext {



    public EasyExcelStrategy getStrategy(Class<?> clazz) {
        if (clazz == null) {
            throw new IllegalArgumentException("clazz should not be empty...");
        }
        return (EasyExcelStrategy) SpringUtils.getBean(clazz);
    }
}
