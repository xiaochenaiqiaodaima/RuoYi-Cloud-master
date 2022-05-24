package com.ruoyi.common.core.constant;

/**
 * @TaskCode:
 * @description: 缓存key 常量
 * @author: minshuai.chen
 * @create: 2022/5/11 16:57
 **/
public class CacheConstants {
    /**
     * 缓存有效期，默认720（分钟）
     */
    public final static long EXPIRATION = 720;

    /**
     * 缓存刷新时间，默认120（分钟）
     */
    public final static long REFRESH_TIME = 120;

    /**
     * 权限缓存前缀
     */
    public final static String LOGIN_TOKEN_KEY = "login_tokens:";
}
