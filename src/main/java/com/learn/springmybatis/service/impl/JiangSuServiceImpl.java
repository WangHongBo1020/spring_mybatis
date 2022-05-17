package com.learn.springmybatis.service.impl;

import com.learn.springmybatis.entity.jiangsu.JsRePushMsg;
import com.learn.springmybatis.mapper.LossDeterToRiskDao;
import com.learn.springmybatis.service.JiangSuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * com.learn.springmybatis.service.impl
 *
 * @Author wujiyao
 * @create 2021 2021/5/21 19:33
 */
@Service
public class JiangSuServiceImpl implements JiangSuService {
    @Autowired
    private LossDeterToRiskDao lossDeterToRiskDao;

    @Override
    public void insertJsClaimXml() {
        JsRePushMsg pushMsg = new JsRePushMsg();
        pushMsg.setSid(UUID.randomUUID().toString().trim().replace("-",""));
        pushMsg.setMsg_Xml("<?xml encoding ...>");
        pushMsg.setOptime(new Date());
        pushMsg.setFlag("2");
        pushMsg.setWorktype("301");
        pushMsg.setClaimNo("C035505282021800019");
        pushMsg.setUnitcode("03");
        pushMsg.setJs_Exchange("exchange");
        pushMsg.setJs_Queue("queue");
        pushMsg.setOptimes(0);
        lossDeterToRiskDao.insertJsMsgXml(pushMsg);
    }

    @Override
    public void insertJsMsgXmlOriginal() {
        JsRePushMsg pushMsg = new JsRePushMsg();
        pushMsg.setSid(UUID.randomUUID().toString().trim().replace("-",""));
        pushMsg.setMsg_Xml("<?xml encoding ...>");
        pushMsg.setOptime(new Date());
        pushMsg.setFlag("2");
        pushMsg.setWorktype("301");
        pushMsg.setClaimNo("C035505282021800019");
        pushMsg.setUnitcode("03");
        pushMsg.setJs_Exchange("exchange");
        pushMsg.setJs_Queue("queue");
        pushMsg.setOptimes(0);
        lossDeterToRiskDao.insertJsMsgXmlOriginal(pushMsg);
    }
}
