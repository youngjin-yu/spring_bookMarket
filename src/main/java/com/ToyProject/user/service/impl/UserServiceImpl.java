package com.ToyProject.user.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToyProject.user.mapper.UserMapper;
import com.ToyProject.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void insertUser() throws Exception {
		
	}

	@Override
	public void selectUser() throws Exception {
		
	}

	@Override
	public void selectUserList() throws Exception {
		
	}

	@Override
	public void updateUser() throws Exception {
		
	}

	@Override
	public void deleteUser() throws Exception {
		
	}



}
