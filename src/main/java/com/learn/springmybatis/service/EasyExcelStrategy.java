package com.learn.springmybatis.service;

import java.util.List;

/**
 * @author lvz
 * @date 2021/6/18
 */
public interface EasyExcelStrategy {

    /**
     * 批量插入方法
     *
     * @param list List<T>
     */
    void saveBatch(List<?> list);
}
