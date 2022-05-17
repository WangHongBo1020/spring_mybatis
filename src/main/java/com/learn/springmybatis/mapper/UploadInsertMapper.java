package com.learn.springmybatis.mapper;

import com.learn.springmybatis.entity.test.ServiceStrategyEnum;
import com.learn.springmybatis.service.EasyExcelStrategy;
import com.learn.springmybatis.service.ExcelContext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author lvz
 * @date 2021/6/18
 */
@Slf4j
@Component
public class UploadInsertMapper {

    public void save(List<?> list) {
        ExcelContext context = new ExcelContext();
        //获取当前入参的类型
        String entityStr = list.get(0).getClass().getSimpleName();
        Class<?> clazz = ServiceStrategyEnum.getServiceClassByServiceId(entityStr);
        if (clazz != null){
            EasyExcelStrategy easyExcelStrategy = context.getStrategy(clazz);
            easyExcelStrategy.saveBatch(list);
        }
    }
}
