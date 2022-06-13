package com.ruoyi.common.security.annotation;

import java.lang.annotation.*;

/**
 * @TaskCode:
 * @description: 内部认证注解
 * @author: minshuai.chen
 * @create: 2022/5/27 16:00
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InnerAuth {

    /**
     * 是否校验用户信息
     */
    boolean isUser() default false;
}
