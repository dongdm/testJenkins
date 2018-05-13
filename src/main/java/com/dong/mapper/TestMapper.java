package com.dong.mapper;

import java.util.List;

import com.dong.model.Test;

public interface TestMapper {
	
	public List<Test> selectAll();
	
	public void deleteById(Integer id);
	
	public void add(Test test);
	
	public void updateById(Test test);
	
	public Test selectById(Integer id);

}
