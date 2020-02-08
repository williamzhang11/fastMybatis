package com.xiu.fasteventdrivermodle.service;

import java.util.List;

import com.xiu.fasteventdrivermodle.entity.Area;

public interface AreaService {

	public List<Area> queryArea();
	
	public Area queryAreaById(int areaId);
	
	public int insertArea(Area area);
	
	public int updateArea(Area area);
	
	public int deleteArea(int areaId);
}
