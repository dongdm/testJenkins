package com.dong.commons.shiro;

import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description：shiro权限认证
 * @date：2015/10/1 14:51
 */
public class ShiroDbRealm extends AuthorizingRealm {
	
	private String account = "dong";
	
	private String password = "123456";

    private static Logger LOGGER = LoggerFactory.getLogger(ShiroDbRealm.class);


    /**
     * Shiro登录认证(原理：用户提交 用户名和密码  --- shiro 封装令牌 ---- realm 通过用户名将密码查询返回 ---- shiro 自动去比较查询出密码和用户输入密码是否一致---- 进行登陆控制 )
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        LOGGER.info("Shiro开始登录认证");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        
        ShiroUser shiroUser = new ShiroUser(account, new ArrayList<>(0));
       
        // 认证缓存信息
        return new SimpleAuthenticationInfo(shiroUser, DigestUtils.md5Hex(password), getName());

    }

    /**
     * Shiro权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        return null;
    }
}
