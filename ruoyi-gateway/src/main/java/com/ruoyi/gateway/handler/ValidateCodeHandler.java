package com.ruoyi.gateway.handler;

import com.ruoyi.common.core.exception.user.CaptchaException;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.gateway.service.ValidateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.io.IOException;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/6/13 17:03
 **/
@Component
public class ValidateCodeHandler  implements HandlerFunction<ServerResponse> {

    @Autowired
    private ValidateCodeService validateCodeService;


    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        {
            AjaxResult ajax;
            try
            {
                ajax = validateCodeService.createCaptcha();
            }
            catch (CaptchaException | IOException e)
            {
                return Mono.error(e);
            }
            return ServerResponse.status(HttpStatus.OK).body(BodyInserters.fromValue(ajax));
        }
    }
}
