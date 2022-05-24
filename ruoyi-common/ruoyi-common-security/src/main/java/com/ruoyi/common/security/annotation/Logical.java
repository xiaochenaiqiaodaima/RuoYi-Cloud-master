package com.ruoyi.common.security.annotation;

/**
 * @TaskCode:
 * @description: 权限注解的验证模式
 * @author: minshuai.chen
 * @create: 2022/5/24 17:31
 **/
public enum Logical {

    /**
     * 必须具有所有的元素
     */
    AND,

    /**
     * 只需具有其中一个元素
     */
    OR
}
