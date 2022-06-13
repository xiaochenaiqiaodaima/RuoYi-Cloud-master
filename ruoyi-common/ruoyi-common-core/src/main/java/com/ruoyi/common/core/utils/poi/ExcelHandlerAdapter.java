package com.ruoyi.common.core.utils.poi;

/**
 * @TaskCode:
 * @description: Excel数据格式处理适配器
 * @author: minshuai.chen
 * @create: 2022/6/13 15:09
 **/
public interface ExcelHandlerAdapter {
    /**
     * 格式化
     *
     * @param value 单元格数据值
     * @param args excel注解args参数组
     *
     * @return 处理后的值
     */
    Object format(Object value, String[] args);
}
