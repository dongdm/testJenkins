package com.dong.service.impl;

import org.springframework.stereotype.Service;

import com.dong.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	public String sayHello(String name) {
		return "Hello:" + name;
	}


}
