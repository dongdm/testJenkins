package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView view = new ModelAndView("user/login");
		return view;
	}

}
