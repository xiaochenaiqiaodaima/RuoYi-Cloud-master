package com.ruoyi.system;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @TaskCode:
 * @description: 系统模块
 * @author: minshuai.chen
 * @create: 2022/2/21 10:06
 **/
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class RuoYiSystemApplication {
}
