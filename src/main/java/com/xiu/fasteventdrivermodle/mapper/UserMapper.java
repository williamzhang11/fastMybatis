package com.xiu.fasteventdrivermodle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xiu.fasteventdrivermodle.entity.User;
import com.xiu.fasteventdrivermodle.vo.UserAreaLists;
import com.xiu.fasteventdrivermodle.vo.UserAreas;

@Mapper
public interface UserMapper {

	public User getUserByNameAndArea(@Param("userName")String userName,@Param("areaName")String areaName);
	
	public UserAreas getUserAreasByUserId(Integer userId);
	
	public UserAreaLists getUserAreasByAreaName(String areaName);
	
	public User getUserById(Integer userId);
	
}
