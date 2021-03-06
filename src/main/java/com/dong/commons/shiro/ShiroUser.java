/**
 *
 */
package com.dong.commons.shiro;

import java.io.Serializable;
import java.util.List;

/**
 * @description：自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息
 */
public class ShiroUser implements Serializable {

    private static final long serialVersionUID = -1373760761780840081L;
    public String loginName;
    public String name;
    public List<Long> roleList;

    public ShiroUser(String name, List<Long> roleList) {
        this.name = name;
        this.roleList = roleList;
    }

    public String getName() {
        return name;
    }

    /**
     * 本函数输出将作为默认的<shiro:principal/>输出.
     */
    @Override
    public String toString() {
        return loginName;
    }
}