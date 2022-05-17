/*
package com.learn.springmybatis.redis;

import com.learn.springmybatis.redis.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.util.List;
import java.util.Set;

*/
/**
 * 登陆redies取值，存值
 *//*

@Slf4j
public class CheckUserService {
    private static CheckUserService instance = null;

    public static synchronized CheckUserService getInstance() {
        if (instance == null) {
            instance = new CheckUserService();
        }
        return instance;
    }

    public CheckUserService() {

    }

    */
/**
     * 判断jedis是否存活
     * @return
     *//*

    public boolean getRedisIsOk() {
        boolean result = true;
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            String ping = jedis.ping();
            if (ping.equalsIgnoreCase("PONG")) {
                log.info("redis服务正常" + ping);
            }
        } catch (Exception e) {
            log.info("redis服务断开！");
            result = false;
        }
        return result;
    }

    public Integer getTimes(String id) {
        Integer returnInt = 0;
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            byte[] a = jedis.get(id.getBytes());
            if (a != null) {
                returnInt = (Integer) unserialize(a);
            }
        } catch (Exception e) {
            log.error("查询用户登录失败次数出现错误：", e);
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return returnInt;
    }

    */
/**
     * @param id   用户名+设备编码
     *//*

    public void saveTimes(String id, int times, int lockTime) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.set(id.getBytes(), serialize(times));
            jedis.expire(id, lockTime);
        } catch (Exception e) {
            log.error("保存用户登录失败次数出现错误：", e);
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    */
/**
     * @param id 用户名+设备编码
     *//*

    public void removeTimes(String id) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.del(id.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    */
/**
     * 剩余到期时间
     *
     * @param id
     *//*

    public Long surplusTime(String id) {
        Jedis jedis = null;
        Long time = -1L;
        try {
            jedis = RedisUtil.getJedis();
            time = jedis.pttl(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return time;
    }

    public void setUserCode(String id, String userCode, int time) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.setex(id, time, userCode);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    public String getUserCode(String key) {
        Jedis jedis = null;
        String userCode = "";
        try {
            jedis = RedisUtil.getJedis();
            userCode = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return userCode;
    }

    public void delUserCode(String key) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.del(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }



    public static byte[] serialize(Object object) {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (baos != null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static Object unserialize(byte[] bytes) {
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(bais!=null){
                try {
                    bais.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    */
/**
     * 设置redis过期时间
     *//*

    public void setValidateTime(String id, int validateTime) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.expire(id, validateTime);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();

        }
    }

    public void set(String key, String value, int time) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.setex(key, time, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }

    public String get(String key) throws Exception {
        Jedis jedis = null;
        String value = "";
        try {
            jedis = RedisUtil.getJedis();
            value = jedis.get(key);
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            jedis.close();
        }
        return value;
    }

    */
/**
     * redies获取list集合
     *
     * @param <T>
     * @param key
     * @return 2018年12月14日上午9:43:07
     * @author yujianxiong-phq
     *//*

    public <T> List<T> getList(String key) {
        Jedis jedis = null;
        List<T> list = null;
        try {
            jedis = RedisUtil.getJedis();
            byte[] in = jedis.get(key.getBytes());
            if (in != null) {
                list = (List<T>) unserialize(in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return list;

    }

    */
/**
     * redies存入list集合
     *
     * @param key
     * @param list 2018年12月14日上午9:49:05
     * @author yujianxiong-phq
     *//*

    public <T> void setList(String key, List<T> list) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            jedis.set(key.getBytes(), serialize(list));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }
    }


    public void lpush(final String key, final String... string) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            Long lpush = jedis.lpush(key, string);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }


    public long lrem(final String key, long count, final String value) {
        Jedis jedis = null;
        Long lrem = 0L;
        try {
            jedis = RedisUtil.getJedis();
            lrem = jedis.lrem(key, 0, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return lrem;
    }

    */
/**
     * @Author:xielianda
     * @Description: 从右往左添加redis元素
     * @Date: 2019年7月16日 上午11:12:20
     * @param: @param key
     * @param: @param string
     * @return: void
     *//*

    public void rpush(final String key, final String... string) {
        Jedis jedis = null;
        try {
            jedis = RedisUtil.getJedis();
            Long rpush = jedis.rpush(key, string);
        } catch (Exception e) {
            log.error("redis从右往左添加元素报错", e);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }

    public List<String> lrange(final String key, final long start, final long end) {
        Jedis jedis = null;
        List<String> list = null;
        try {
            jedis = RedisUtil.getJedis();
            list = jedis.lrange(key, 0, -1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return list;
    }

    */
/**
     * @return java.util.List<java.lang.String>
     * @Author ZhangYiKun
     * @Date 2019/5/20 14:31
     * @Description //TODO Redis模糊匹配,取得key列表
     * @Param
     **//*

    public Set<String> query(String queryField) {
        Jedis jedis = null;
        Set<String> queryList = null;
        try {
            jedis = RedisUtil.getJedis();
            queryList = jedis.keys(queryField);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return queryList;
    }

    */
/**
     * 给key加锁
     *
     * @param key
     * @param value
     * @return
     *//*

    public String setnxToString(String key, String value) {
        Jedis jedis = RedisUtil.getJedis();
        try {
            if (jedis != null) {
                Long nxvalue = jedis.setnx(key, value);
                return nxvalue.toString();
            }

        } finally {
            RedisUtil.returnResource(jedis);
        }

        return null;

    }

    */
/**
     * 重置key 的缓存过期时间
     *
     * @param key
     * @param expire
     *//*

    public void setExpire(String key, int expire) {
        Jedis jedis = RedisUtil.getJedis();
        try {
            if (jedis != null) {
                jedis.expire(key, expire);
            }

        } finally {
            RedisUtil.returnResource(jedis);
        }

    }

}
*/
