package com.xiu.fasteventdrivermodle.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiu.fasteventdrivermodle.entity.Area;
import com.xiu.fasteventdrivermodle.mapper.AreaMapper;
import com.xiu.fasteventdrivermodle.service.AreaService;


@RestController
@RequestMapping("/area")
public class AreaController {
	
	@Autowired
	AreaService areaService;
	
	
	@RequestMapping("/get")
	public String getArea() {
		List<Area> areas = areaService.queryArea();
		System.out.println(areas.toString());
		return "success";
	}
	
	@RequestMapping("/getid")
	public String getAreabyId(Integer areaId) {
		Area areas = areaService.queryAreaById(areaId);
		System.out.println(areas.toString());
		return "success";
	}
	@RequestMapping("/save")
	public String saveArea() {
		
		Area area = new Area();
		area.setAreaName("东1");
		area.setCreateTime(new Date());
		area.setPriority(10);
		area.setLastEditTime(new Date());
		
		int areas = areaService.insertArea(area);
		System.out.println(areas);
		System.out.println(area.getAreaId());
		return "success";
	}
	
	@RequestMapping("/update")
	public String updateArea(Integer areaId) {
		
		Area area = new Area();
		area.setAreaId(areaId);
		area.setLastEditTime(new Date());
		
		int areas = areaService.updateArea(area);
		System.out.println(areas);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteArea(Integer areaId) {
		
		Area area = new Area();
		area.setAreaId(areaId);
		area.setLastEditTime(new Date());
		
		int areas = areaService.deleteArea(areaId);
		System.out.println(areas);
		return "success";
	}
	
}
