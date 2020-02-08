package com.xiu.fasteventdrivermodle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiu.fasteventdrivermodle.entity.Area;
import com.xiu.fasteventdrivermodle.mapper.AreaMapper;
import com.xiu.fasteventdrivermodle.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	AreaMapper areaMapper;
	
	public List<Area> queryArea(){
		
		return areaMapper.queryArea();
	}
	
	public Area queryAreaById(int areaId) {
		 return areaMapper.queryAreaById(areaId);
	}

	@Override
	public int insertArea(Area area) {
		// TODO Auto-generated method stub
		return areaMapper.insertArea(area);
	}

	@Override
	public int updateArea(Area area) {
		// TODO Auto-generated method stub
		return areaMapper.updateArea(area);
	}

	@Override
	public int deleteArea(int areaId) {
		// TODO Auto-generated method stub
		return areaMapper.deleteArea(areaId);
	}
}
