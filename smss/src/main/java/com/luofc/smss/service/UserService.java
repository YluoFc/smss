package com.luofc.smss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luofc.smss.bean.User;
import com.luofc.smss.dao.UserMapper;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**  
* @Title: UserService.java
* @Package:com.luofc.smss.service
* @author:luoFc 
* @date:2019年1月26日-下午3:31:34
* @emal:523232622@qq.com
* @Description:(用户的业务层类)
*/

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	//通过用户名查找一个用户
	public User findByUserName(String username) {
		
		return userMapper.selectByUserName(username);
		
	}

	//查询所有用户
	public List<User> findAllUser(){

		return userMapper.selectByExample(null);
	}

	//添加用户
	public void insertUser(User user){

		userMapper.insert(user);
	}

	//通过ID删除用户
	public void deleteUser(Integer id){
		userMapper.deleteByPrimaryKey(id);
	}
}
