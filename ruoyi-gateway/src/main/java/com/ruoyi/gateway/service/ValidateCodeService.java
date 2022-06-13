package com.ruoyi.gateway.service;

import com.ruoyi.common.core.exception.user.CaptchaException;
import com.ruoyi.common.core.web.domain.AjaxResult;

import java.io.IOException;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/6/13 17:05
 **/
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
