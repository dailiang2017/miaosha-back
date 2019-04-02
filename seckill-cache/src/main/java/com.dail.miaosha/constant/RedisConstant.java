package com.dail.miaosha.constant;

/**
 * @Auther: dailiang
 * @Date: 2018/12/28 14:01
 * @Description:
 */
public class RedisConstant {

    /**
     * 缓存 默认超时时间一天，单位秒
     */
    public static final int redisToExpireDefault = 24 * 60 * 60;

    /**
     * token缓存 默认超时时间一分钟，单位秒
     */
    public static final int tokenToExpireDefault = 60;

    /**
     * cookie缓存 默认超时时间比token多10分钟，单位秒
     */
    public static final int cookieToExpireDefault = 60 * 10 + tokenToExpireDefault;
}
