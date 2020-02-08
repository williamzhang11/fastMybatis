package com.xiu.fasteventdrivermodle.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiu.fasteventdrivermodle.entity.Area;


@Mapper
public interface AreaMapper {

	List<Area> queryArea();
	
	Area queryAreaById(int areaId);
	
	int insertArea(Area area);
	
	int updateArea(Area area);
	
	int deleteArea(int areaId);
}













