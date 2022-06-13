package com.ruoyi.common.core.web.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/6/13 11:24
 **/
@Data
public class TreeEntity extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 父菜单名称 */
    private String parentName;

    /** 父菜单ID */
    private Long parentId;

    /** 显示顺序 */
    private Integer orderNum;

    /** 祖级列表 */
    private String ancestors;

    /** 子部门 */
    private List<?> children = new ArrayList<>();
}
