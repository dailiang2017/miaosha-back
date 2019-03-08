package com.dail.miaosha.util;

import com.dail.miaosha.constant.RedisConstant;
import com.dail.miaosha.dto.CacheResult;
import com.dail.miaosha.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: dail
 * @CreateDate: 2019/3/6 15:58
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 设置缓存-默认时间
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, Object value) {
        return setBase(key, StringUtil.beanToString(value), RedisConstant.redisToExpireDefault);
    }

    /**
     * 设置缓存
     * @param key
     * @param value
     * @param time 时间，单位：秒
     * @return
     */
    public boolean set(String key, Object value, long time) {
        return setBase(key, StringUtil.beanToString(value), time);
    }

    /**
     * 获得缓存
     * @param key
     * @return
     */
    public <T> CacheResult<T> get(String key, Class<T> tClass) {
        CacheResult result = new CacheResult();
        result.setData(StringUtil.stringToBean(this.getBase(key), tClass));
        return result;
    }

    public boolean delete(String key) {
        return redisTemplate.delete(key);
    }

    /**
     * 缓存设置
     * @param key
     * @param value
     * @param time
     * @param
     */
    private Boolean setBase(String key, String value, long time) {
        if (value == null) return false;
        if (time < 0) time = 0L;
        redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
        return true;
    }

    /**
     * 获取缓存
     * @param key
     * @return
     */
    private String getBase(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
