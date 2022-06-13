package com.ruoyi.common.core.utils;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.utils.sql.SqlUtil;
import com.ruoyi.common.core.web.page.PageDomain;
import com.ruoyi.common.core.web.page.TableSupport;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/6/13 14:35
 **/
public class PageUtils extends PageHelper {
    /**
     *  设置请求分页数据
     */

    public static void startPage(){
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            Boolean reasonable = pageDomain.getReasonable();
            PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
        }
    }
}
