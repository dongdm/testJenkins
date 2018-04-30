package com.dong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dong.model.Test;

@RestController
public class TestController {
	
	@RequestMapping(value="/getTest")
	@ResponseBody
	public String getTest(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		Test test = new Test();
		test.setId(1);
		test.setName("小名小名");
		return test.toString();
	}


}
