package com.learn.springmybatis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.learn.springmybatis.entity.qiandao.GroupCacheHandler;
import com.learn.springmybatis.entity.test.GibaoanInfo;
import com.learn.springmybatis.exception.BusException;
import com.learn.springmybatis.mapper.SignMapperDao;
import com.learn.springmybatis.service.SignService;
import com.learn.springmybatis.utils.*;
import com.sun.deploy.util.StringUtils;
import org.apache.ibatis.executor.BaseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * com.learn.springmybatis.service.impl
 *
 * @Author wujiyao
 * @create 2021 2021/5/27 9:52
 */
@Service
public class SignServiceImpl implements SignService {

    @Resource
    private SignMapperDao signMapperDao;

    private static final String s;
    private static final String b;

    static {
         s = "1";
         b = "2";
    }

    @Override
    public List<String> getNotContainDSPostGroupInfoByUserCode(String userCode) {
        return signMapperDao.getNotContainDSPostGroupInfoByUserCode(userCode);
    }

    @Override
    public List<GroupCacheHandler> getGroupCacheHandler(String groupId, String userCode, String isVideo) {
        List<GroupCacheHandler> groupCacheHandlers = signMapperDao.getGroupCacheHandler(groupId, userCode, isVideo);
        isAlwaysExistsGroupUserCodeId(groupCacheHandlers, "0");
        return groupCacheHandlers;
    }

    private boolean isAlwaysExistsGroupUserCodeId(List<GroupCacheHandler> signListBefore, String isVideo) {
        boolean flag = false;
        for (GroupCacheHandler sign : signListBefore) {
            if(sign.getIsVideo().equals(isVideo)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void addGroupHandlerCache(GroupCacheHandler cacheHandler) {

    }

    @Override
    public void addGroupHandlerCacheList(List<GroupCacheHandler> cacheHandlers) {

    }

    @Override
    public void delGroupCacheHandler(String groupId, String userCode, String isVideo) {

    }

    @Override
    public boolean getRedisBeforeStatus() {
        return false;
    }

    @Override
    public void modifyRedisFlagWhenNotCon(String key, String value) {

    }

    @Override
    public List<GroupCacheHandler>  getGroupHandlerMap(String s) {

        return signMapperDao.getGroupCacheHandlerMap(s);
    }

    @Override
    public List<String> getGroupCacheHandlerUserCodeList() {
        String claimNo = "R025505282021800197";
        String ccc= signMapperDao.findSzRePushMsgBySequenceNo(claimNo);

        return signMapperDao.getGroupCacheHandlerUserCodeList("01000039", null, "1");
    }

    @Override
    public String findSzRePushMsgByclaimNo() {
        String claimNo = "R095705072023800032";
        String caseno = "C095705282023800174";
        String estimateno = "100307268";
        List<C_Claim> claimNo1 = signMapperDao.getclaimNo(caseno);
        System.out.println("claimNo1" + claimNo1);
        boolean typeSwitch = signMapperDao.getSwitch(claimNo1.get(0).getClaimno1());


        System.out.println("lossPartVOList---" + JSONObject.toJSONString(typeSwitch));


        return null;
    }

    @Override
    public AmlCustomerNature getCustomerNatureIdcardNo(String idcardNo) {
        AmlCustomerNature customerNature = signMapperDao.getCustomerNatureIdcardNo(idcardNo);
        if (customerNature == null){
            throw new BusException("用户无信息");
        }
        return customerNature;
    }

     /*public static void main(String[] args) {
        String caseNo = "C015505282021801878";
        List<GibaoanInfo> gibaoanInfos = signMapperDao.getgibaoanInfos(caseNo);

        System.out.println("adjustment" + adjustment);
    }*/


}
