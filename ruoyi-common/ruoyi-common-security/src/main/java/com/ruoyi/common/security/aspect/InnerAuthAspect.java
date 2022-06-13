package com.ruoyi.common.security.aspect;

import com.ruoyi.common.core.constant.SecurityConstants;
import com.ruoyi.common.core.exception.user.InnerAuthException;
import com.ruoyi.common.core.utils.ServletUtils;
import com.ruoyi.common.security.annotation.InnerAuth;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/5/27 16:01
 **/
@Aspect
@Component
public class InnerAuthAspect implements Ordered {


    @Around("@annotation(innerAuth)")
    public Object innerAround(ProceedingJoinPoint point, InnerAuth innerAuth) throws Throwable{
        String source = ServletUtils.getRequest().getHeader(SecurityConstants.FROM_SOURCE);
        // 内部请求认证
        if (!StringUtils.equals(SecurityConstants.INNER,source)){
            throw new InnerAuthException("没有内部访问权限，不允许访问");
        }
        String userid = ServletUtils.getRequest().getHeader(SecurityConstants.DETAILS_USER_ID);
        String username = ServletUtils.getRequest().getHeader(SecurityConstants.DETAILS_USERNAME);

        //用户信息验证
        if (innerAuth.isUser() && (com.ruoyi.common.core.utils.StringUtils.isEmpty(userid) || com.ruoyi.common.core.utils.StringUtils.isEmpty(username)))
        {
            throw new InnerAuthException("没有设置用户信息，不允许访问 ");
        }
        return point.proceed();
    }


    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 1;
    }
}
