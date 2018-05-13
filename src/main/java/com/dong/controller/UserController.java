package com.dong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dong.model.Test;
import com.dong.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("doEdit")
	public ModelAndView doEdit(Test test) {
		userService.update(test);
		return new ModelAndView("redirect:/user/list");
	}
	
	@RequestMapping("/editPage")
	public ModelAndView editPage(Integer id) {
		ModelAndView view = new ModelAndView("user/edit");
		Test test = userService.selectOne(id);
		if(null != test) {
			view.addObject("test", test);
		}else {
			view.setViewName("redirect:user/list");
		}
		return view;
	}
	
	
	@RequestMapping("doAdd")
	public ModelAndView doAdd(Test test) {
		userService.add(test);
		return new ModelAndView("redirect:/user/list");
	}
	
	@RequestMapping("/addPage")
	public ModelAndView addPage() {
		return new ModelAndView("user/add");
	}
	
	
	@RequestMapping("/list")
	public ModelAndView testList() {
		ModelAndView view = new ModelAndView();
		List<Test> result = userService.selectAll();
		JSONArray jsonArr = (JSONArray)JSON.toJSON(result);
		view.addObject("list", jsonArr);
		view.setViewName("user/test");
		return view;
	}
	
	
	@RequestMapping("/del")
	public ModelAndView testDelete(Integer id) {
		userService.delete(id);
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/user/list");
		return view;
	}
	
	@RequestMapping("/add")
	public ModelAndView testAdd(Test test) {
		userService.add(test);
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/user/list");
		return view;
	}
	
	
	
	
}
