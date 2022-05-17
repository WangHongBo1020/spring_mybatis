package com.learn.springmybatis.redis.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import javax.annotation.PostConstruct;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class RedisUtil {
   
	/*private static String address;
	@Value("${redis.sentinel.address}")
	public void setAddress(String address) {
		RedisUtil.address = address;
	}
	
    
	private static String name;
	@Value("${redis.master.name}")
	public void setName(String name) {
		RedisUtil.name = name;
	}
	
   
	private static String authh;
    @Value("${redis.auth}")
	public void setAuth(String authh) {
		RedisUtil.authh = authh;
	}

	// 超时间 秒/单位
    public static int SESSION_TIME_OUT = 1800;
    private static JedisSentinelPool jedisSentinelPool = null;

    *//**
     * 初始化Redis连接池
     *//*
    @PostConstruct
    public void initJedisPoll() {
    	 Set<String> sentinels = new HashSet<String>();
         try {
             for (String address1 : address.split("/")) {
                 sentinels.add(address1);
             }
             JedisPoolConfig config = new JedisPoolConfig();
             config.setMaxTotal(1024);//最大连接数
             config.setMaxIdle(16);//最大空闲连接数
             config.setMaxWaitMillis(1000);//获取连接时的最大等待毫秒数
             config.setTestOnBorrow(true);
             System.out.println("name"+name+"authh"+authh);
             jedisSentinelPool = new JedisSentinelPool(name, sentinels, config, authh);
             clearCach();
      
         } catch (Exception e) {
             if (jedisSentinelPool != null)
                 e.printStackTrace();
         }
    }
    public static <T> void clearCach() {
    	Jedis jedis = getJedis();
		List<T> list = null;
    	try {
    		byte[] in = jedis.get("onlineuserlist".getBytes());
			if (in != null) {
				list = (List<T>) unserialize(in);
			}
			if(list!=null&&!list.isEmpty()) {
				for (T userCode : list) {
					jedis.del("rtmp"+userCode);					
				}
			}
			jedis.del("onlineuserlist");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}
        
    }

    *//**
     * 获取Jedis实例
     * @return
     *//*
    public synchronized static  Jedis getJedis() {
        try {
            if (jedisSentinelPool != null) {
                Jedis resource = jedisSentinelPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    *//**
     * 释放jedis资源
     * @param jedis
     *//*
    public static void returnResource(final Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }

	public static Object unserialize(byte[] bytes) {
		ByteArrayInputStream bais = null;
		try {
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/
  
}
