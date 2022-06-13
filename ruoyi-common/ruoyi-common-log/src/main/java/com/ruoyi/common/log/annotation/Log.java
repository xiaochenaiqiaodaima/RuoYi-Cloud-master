package com.ruoyi.common.log.annotation;

import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.log.enums.OperatorType;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/5/30 15:31
 **/
public @interface Log {
    /**
     * 模块
     */
    public String title() default "";

    /**
     * 功能
     */
    public BusinessType businessType() default BusinessType.OTHER;

    /**
     * 操作人类别
     */
    public OperatorType operatorType() default OperatorType.MANAGE;

    /**
     * 是否保存请求的参数
     */
    public boolean isSaveRequestData() default true;

    /**
     * 是否保存响应的参数
     */
    public boolean isSaveResponseData() default true;
}
