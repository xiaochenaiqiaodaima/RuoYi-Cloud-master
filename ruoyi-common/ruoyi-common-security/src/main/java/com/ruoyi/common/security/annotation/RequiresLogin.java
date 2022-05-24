package com.ruoyi.common.security.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @TaskCode:
 * @description: 登录认证：只有登录之后才能进入该方法
 * @author: minshuai.chen
 * @create: 2022/5/24 17:39
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface RequiresLogin {
}
