package com.xiu.fasteventdrivermodle.service;


import com.xiu.fasteventdrivermodle.entity.User;
import com.xiu.fasteventdrivermodle.vo.UserAreaLists;
import com.xiu.fasteventdrivermodle.vo.UserAreas;

public interface UserService {
	
	public User getUserById(Integer userId);
	
	public UserAreas getUserAreasByUserId(Integer userId);
	
	public UserAreaLists getUserAreasByAreaName(String areaName);
	
	public User getUserByNameAndArea(String userName,String areaName);
}
