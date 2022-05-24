package com.ruoyi.common.core.exception.auth;

/**
 * @TaskCode:
 * @description: 未能通过的登录认证异常
 * @author: minshuai.chen
 * @create: 2022/5/24 16:10
 **/
public class NotLoginException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public NotLoginException(String message){
        super(message);
    }
}
