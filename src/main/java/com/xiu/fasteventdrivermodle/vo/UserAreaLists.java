package com.xiu.fasteventdrivermodle.vo;

import java.util.List;

import com.xiu.fasteventdrivermodle.entity.Area;

public class UserAreaLists {
	private Integer userId;
	private String userName;
	private List<Area> areaList;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Area> getAreaList() {
		return areaList;
	}
	public void setAreaList(List<Area> areaList) {
		this.areaList = areaList;
	}
	@Override
	public String toString() {
		return "UserAreaLists [userId=" + userId + ", userName=" + userName + ", areaList=" + areaList + "]";
	}
	
}
