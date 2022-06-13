package com.ruoyi.common.core.exception.user;

/**
 * @TaskCode:
 * @description: 内部认证异常
 * @author: minshuai.chen
 * @create: 2022/5/27 15:51
 **/
public class InnerAuthException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InnerAuthException(String message)
    {
        super(message);
    }
}
