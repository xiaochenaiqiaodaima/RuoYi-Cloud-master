package com.ruoyi.common.security.annotation;

import com.ruoyi.common.security.config.ApplicationConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import java.lang.annotation.*;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/2/21 10:45
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
// 表示通过aop框架暴露该代理对象，AOPContext能够访问
@EnableAspectJAutoProxy(exposeProxy = true)
// 指定要扫描的Mapper类的包的路径
@MapperScan("com.ruoyi.**.mapper")
// 开启线程异步执行
@EnableAsync
// 自动加载类
@Import({ApplicationConfig.class})
public @interface EnableCustomConfig {
}
