package com.ruoyi.system.api.model;

import com.ruoyi.system.api.domain.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @TaskCode:
 * @description:
 * @author: minshuai.chen
 * @create: 2022/5/11 16:08
 **/
@Data
public class LoginUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    private String token;

    /**
     * 用户名id
     */
    private Long userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录时间
     */
    private Long loginTime;

    /**
     * 过期时间
     */
    private Long expireTime;

    /**
     * 登录IP地址
     */
    private String ipaddr;

    /**
     * 权限列表
     */
    private Set<String> permissions;

    /**
     * 角色列表
     */
    private Set<String> roles;

    /**
     * 用户信息
     */
    private SysUser sysUser;
}
