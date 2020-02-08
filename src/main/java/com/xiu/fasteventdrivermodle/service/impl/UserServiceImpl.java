package com.xiu.fasteventdrivermodle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiu.fasteventdrivermodle.entity.User;
import com.xiu.fasteventdrivermodle.mapper.UserMapper;
import com.xiu.fasteventdrivermodle.service.UserService;
import com.xiu.fasteventdrivermodle.vo.UserAreaLists;
import com.xiu.fasteventdrivermodle.vo.UserAreas;

@Service
	
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserById(Integer userId) {
		
		return userMapper.getUserById(userId);
	}

	@Override
	public UserAreas getUserAreasByUserId(Integer userId) {
		return userMapper.getUserAreasByUserId(userId);
	}

	@Override
	public UserAreaLists getUserAreasByAreaName(String areaName) {
		// TODO Auto-generated method stub
		return userMapper.getUserAreasByAreaName(areaName);
	}

	@Override
	public User getUserByNameAndArea(String userName, String areaName) {
		// TODO Auto-generated method stub
		return userMapper.getUserByNameAndArea(userName, areaName);
	}
	
}
