package com.dong.service;

import java.util.List;

import com.dong.model.Test;

public interface UserService {
	
	public String sayHello(String name);
	
	public List<Test> selectAll();
	
	public void delete(Integer id);
	
	public void add(Test test);
	
	public void update(Test test);
	
	public Test selectOne(Integer id);

}
