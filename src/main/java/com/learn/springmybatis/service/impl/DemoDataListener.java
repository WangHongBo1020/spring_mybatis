package com.learn.springmybatis.service.impl;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;


import com.alibaba.fastjson.JSONObject;
import com.learn.springmybatis.entity.test.DemoData;
import com.learn.springmybatis.mapper.DemoDAO;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


// 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
@Slf4j
public class DemoDataListener extends AnalysisEventListener<DemoData> {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(DemoDataListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 500;
    /*List<DemoData> list = new ArrayList<DemoData>();*/
    List<DemoData> list = new ArrayList<>();
    private DemoDAO demoDAO;

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param demoDAO
     */
    public DemoDataListener(DemoDAO demoDAO) {
        this.demoDAO = demoDAO;
    }

    @Override
    public void invoke(DemoData data, AnalysisContext analysisContext) {

        /*logger.info("解析到一条数据:{}", JSONObject.toJSONString(d));*/
        System.out.println("解析到一条数据:" + JSONObject.toJSONString(data));
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        logger.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        /*logger.info("{}条数据，开始存储数据库！", list.size());*/
        System.out.println("条数据，开始存储数据库:" + list.size());
        /*demoDAO.save(list);*/
        System.out.println(JSONObject.toJSONString(list));
        logger.info("存储数据库成功！");
    }
}