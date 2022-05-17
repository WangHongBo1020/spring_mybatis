package com.learn.springmybatis.entity.test;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 模板填充数据封装
 * </p>
 * titleMap 填充至模板中 {} 单数据 map集合
 * dataList 填充至模板中 {.} 数据集合
 *
 * @author lvz
 * @since 2021-04-15
 */
@Data
public class SheetData<T>{

    Map<String,Object> titleMap;

    List<T> dataList;

}
