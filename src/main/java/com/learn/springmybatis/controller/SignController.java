/*
package com.learn.springmybatis.controller;

import com.alibaba.fastjson.JSON;
import com.learn.springmybatis.entity.qiandao.GroupCacheHandler;
import com.learn.springmybatis.redis.CheckUserService;

import com.learn.springmybatis.service.SignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

*
 * com.learn.springmybatis.controller
 *
 * @Author wujiyao
 * @create 2021 2021/5/27 9:49


@Slf4j
@RestController
@RequestMapping("/sign")
public class SignController {

    @Resource
    private SignService service;

    @RequestMapping("/cacheHandler/{groupId}/{userCode}/{isVideo}")
    public List<GroupCacheHandler> getGroupCacheHandler(@PathVariable("groupId") String groupId,
                                                        @PathVariable("userCode") String userCode,
                                                        @PathVariable("isVideo")  String isVideo) {
        return service.getGroupCacheHandler(groupId, userCode, null);
    }

    @RequestMapping("/redisCon")
    public boolean redisCon() {
        return CheckUserService.getInstance().getRedisIsOk();
    }

    @RequestMapping("/addRedisList")
    public boolean addRedisList() {
        List<String> list = new ArrayList<>();
        list.add("01010001");
        list.add("01010002");
        CheckUserService.getInstance().setList("01000032GroupTest",list);
        return true;
    }

    @RequestMapping("/addSignUser")
    public boolean delRedisList() {
        String groupId = "54321";
//        CheckUserService.getInstance().setList("01000032GroupTest",list);
        CheckUserService.getInstance().lpush(groupId+"group", "0011111");
        CheckUserService.getInstance().lpush(groupId+"group", "0022222");

        String groupIdOne = "54322";
        CheckUserService.getInstance().lpush(groupIdOne+"group", "1111111");
        CheckUserService.getInstance().lpush(groupIdOne+"group", "1122222");

        return true;
    }

    @RequestMapping("/lrem")
    public boolean lrem() {
            String groupId = "54321";
//        CheckUserService.getInstance().setList("01000032GroupTest",list);
            CheckUserService.getInstance().delUserCode("*group");
            String str = CheckUserService.getInstance().getUserCode(groupId+"group");
            System.out.println(str);
            return true;

    }

    @RequestMapping("/videoAdd")
    public boolean videoAdd() {
        String groupId = "01000050";
        String redisKey = "MultiUserVideo:" + groupId + "group";
        String redisKey1 = "MultiUserVideo:" + groupId + "group";
        CheckUserService.getInstance().lpush(redisKey, "01040181");
        CheckUserService.getInstance().lpush(redisKey1, "01040182");
//        CheckUserService.getInstance().delUserCode(groupId+"group");
        String str = CheckUserService.getInstance().getUserCode(groupId+"group");
        System.out.println(str);
        return true;
    }

    @RequestMapping("/delAllVideo")
    public boolean delAllVideo() {
        //拼接redis缓存模糊key
        String redisKey = "*group";
        //获取key明细
        Set<String> keys = CheckUserService.getInstance().query(redisKey);
//        CheckUserService.getInstance().delUserCode(redisKey);
        System.out.println("所有的key:"+keys);
        //删除redis缓存中的key
        for (String key : keys) {
            log.info("key="+key);
            CheckUserService.getInstance().delUserCode(key);
        }
        log.info("dyf-multiUserVideoClean对人视频redis呼叫队列删除:keys=" + JSON.toJSONString(keys) + "");
        return true;
    }

    @RequestMapping("/getAllGroup")
    public boolean getAllGroup() {
        //获取key明细
        Set<String> queryList = CheckUserService.getInstance().query("*group");
        //删除redis缓存中的key
        for (String key : queryList) {
            log.info(key);
        }
        log.info("dyf-multiUserVideoClean对人视频redis呼叫队列删除:keys=" + JSON.toJSONString(queryList) + "");
        return true;
    }

    @RequestMapping("/getGroupHandlerMap")
    public List<String>   getGroupHandlerMap() {

        return service.getGroupCacheHandlerUserCodeList();
    }

}
*/
