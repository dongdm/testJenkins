package com.dong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dong.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView view = new ModelAndView("user/login");
		String name = "dongdingming";
		String word = userService.sayHello(name);
		view.addObject("word", word);
		return view;
	}

}
