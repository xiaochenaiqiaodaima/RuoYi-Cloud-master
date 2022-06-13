package com.ruoyi.common.core.xss;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @TaskCode:
 * @description:  自定义xss校验注解
 * @author: minshuai.chen
 * @create: 2022/6/13 10:48
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Constraint(validatedBy = { XssValidator.class })
public @interface Xss {
    String message()

            default "不允许任何脚本运行";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
