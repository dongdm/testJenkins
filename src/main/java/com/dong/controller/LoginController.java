package com.dong.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;

@Controller
public class LoginController {
	
	private static Logger LOG = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView view = new ModelAndView("user/login");
		return view;
	}
	
	@RequestMapping("/doLogin")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView view = new ModelAndView("redirect:/login");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String verfyCode = request.getParameter("verfyCode");
		//验证必填参数
		if(StringUtils.isBlank(account) || StringUtils.isBlank(account) ||
				StringUtils.isBlank(verfyCode)) {
			return view;
		}
		//验证码比对
		String realCode = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if(!verfyCode.equalsIgnoreCase(realCode)) {
			return view;
		}
		//登录验证
		Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(account, DigestUtils.md5Hex(password).toCharArray());
        token.setRememberMe(true);
        try {
            user.login(token);
            view.setViewName("redirect:/user/list");
        } catch (UnknownAccountException e) {
        } catch (DisabledAccountException e) {
        } catch (IncorrectCredentialsException e) {
        } catch (RuntimeException e) {
        }
		return view;
	}

}
