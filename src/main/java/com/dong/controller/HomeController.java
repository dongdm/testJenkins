package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView view = new ModelAndView("user/login");
		return view;
	}

}
