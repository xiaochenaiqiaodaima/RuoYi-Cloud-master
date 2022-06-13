package com.ruoyi.gateway.config;

import com.ruoyi.gateway.handler.SentinelFallbackHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @TaskCode:
 * @description: 网关限流配置
 * @author: minshuai.chen
 * @create: 2022/6/13 16:11
 **/
@Configuration
public class GatewayConfig {

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SentinelFallbackHandler sentinelGatewayExceptionHandler()
    {
        return new SentinelFallbackHandler();
    }
}
