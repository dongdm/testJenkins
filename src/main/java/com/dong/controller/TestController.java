package com.dong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dong.model.Test;

@RestController
public class TestController {
	
	@RequestMapping(value="/getTest", produces="application/json")
	@ResponseBody
	public String getTest() {
		Test test = new Test();
		test.setId(1);
		test.setName("test");
		return test.toString();
	}


}
