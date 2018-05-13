package com.dong.controller;


import org.apache.commons.codec.digest.DigestUtils;
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

@Controller
public class LoginController {
	
	private static Logger LOG = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView view = new ModelAndView("user/login");
		return view;
	}
	
	@RequestMapping("/doLogin")
	public ModelAndView login(String account,String password) {
		LOG.info("account:%s,password:%s", account, password);
		ModelAndView view = new ModelAndView("redirect:/login");
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
