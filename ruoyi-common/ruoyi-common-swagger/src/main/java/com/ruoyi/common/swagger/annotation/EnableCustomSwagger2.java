package com.ruoyi.common.swagger.annotation;

import com.ruoyi.common.swagger.config.SwaggerAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/2/22 11:06
 **/
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ SwaggerAutoConfiguration.class })
public @interface EnableCustomSwagger2 {
}
