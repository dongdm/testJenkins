package com.dong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.mapper.TestMapper;
import com.dong.model.Test;
import com.dong.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private TestMapper testMapper;
	
	public String sayHello(String name) {
		
		
		return "Hello:" + name;
	}
	
	public List<Test> selectAll(){
		List<Test> result = testMapper.selectAll();
		return result;
	}

	@Override
	public void delete(Integer id) {
		testMapper.deleteById(id);
	}

	@Override
	public void add(Test test) {
		testMapper.add(test);
	}

	@Override
	public void update(Test test) {
		testMapper.updateById(test);
	}
	
	public Test selectOne(Integer id) {
		return testMapper.selectById(id);
	}


}
