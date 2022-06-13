package com.ruoyi.common.datascope.annotation;

import java.lang.annotation.*;

/**
 * @TaskCode:
 * @description: 数据权限过滤注解
 * @author: minshuai.chen
 * @create: 2022/5/30 16:28
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {

    /**
     * 部门表的别名
     */
    public String deptAlias() default "";

    /**
     * 用户表的别名
     */
    public String userAlias() default "";
}
