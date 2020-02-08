package com.xiu.fasteventdrivermodle.vo;

import com.xiu.fasteventdrivermodle.entity.Area;

public class UserAreas {

	private Integer userId;
	private String userName;
	private Area area;
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
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "UserAreas [userId=" + userId + ", userName=" + userName + ", area=" + area + "]";
	}
	
	
}
