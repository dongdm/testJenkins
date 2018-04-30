package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dong.model.Test;

@Controller
public class TestController {
	
	@RequestMapping(value="/getTest")
	public ModelAndView getTest() {
		Test test = new Test();
		test.setId(1);
		test.setName("小名小名");
		ModelAndView view = new ModelAndView("/user/test");
		view.addObject("test", test);
		return view;
	}


}
