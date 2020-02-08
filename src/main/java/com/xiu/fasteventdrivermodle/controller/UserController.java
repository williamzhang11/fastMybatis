package com.xiu.fasteventdrivermodle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiu.fasteventdrivermodle.entity.User;
import com.xiu.fasteventdrivermodle.service.UserService;
import com.xiu.fasteventdrivermodle.vo.UserAreaLists;
import com.xiu.fasteventdrivermodle.vo.UserAreas;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/getUser")
	public String getUser(Integer userId) {
		
		System.out.println("userId="+userId);
		User user = userService.getUserById(userId);
		
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("/getUserId")
	public String getUserAreaByid(Integer userId) {
		
		System.out.println("userId="+userId);
		UserAreas userAreas = userService.getUserAreasByUserId(userId);
		System.out.println(userAreas);
		return "success";
	}
	
	@RequestMapping("/getName")
	public String getUserAreaByid(String areaName) {
		
		System.out.println("areaName="+areaName);
		UserAreaLists userAreaLists = userService.getUserAreasByAreaName(areaName);
		System.out.println(userAreaLists);
		return "success";
	}
	
	@RequestMapping("/getUser1")
	public String getUserByNameAndArea(String userName, String areaName) {
		
		System.out.println("areaName="+areaName);
		User user =userService.getUserByNameAndArea(userName,areaName);
		System.out.println(user);
		return "success";
	}
	
}
