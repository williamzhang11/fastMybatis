package com.xiu.fasteventdrivermodle.entity;

public class User {

	private Long userId;
	private String userName;
	private Integer areaId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", areaId=" + areaId + "]";
	}
	
}
