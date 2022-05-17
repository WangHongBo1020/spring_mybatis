package com.learn.springmybatis.service;

import com.learn.springmybatis.entity.qiandao.GroupCacheHandler;
import com.learn.springmybatis.utils.AmlCustomerNature;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * com.learn.springmybatis.service
 *
 * @Author wujiyao
 * @create 2021 2021/5/27 9:51
 */
public interface SignService {
    public List<String> getNotContainDSPostGroupInfoByUserCode(String userCode);

    List<GroupCacheHandler> getGroupCacheHandler( String groupId,String userCode,String isVideo);

    void addGroupHandlerCache(GroupCacheHandler cacheHandler);

    void addGroupHandlerCacheList(List<GroupCacheHandler> cacheHandlers);

    void delGroupCacheHandler(String groupId, String userCode,  String isVideo);

    boolean getRedisBeforeStatus();

    void modifyRedisFlagWhenNotCon( String key,  String value);

    List<GroupCacheHandler> getGroupHandlerMap(String s);

    List<String> getGroupCacheHandlerUserCodeList();

    String findSzRePushMsgByclaimNo();

    AmlCustomerNature getCustomerNatureIdcardNo(String idcardNo);
}
