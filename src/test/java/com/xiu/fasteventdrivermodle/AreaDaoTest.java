package com.xiu.fasteventdrivermodle;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xiu.fasteventdrivermodle.entity.Area;
import com.xiu.fasteventdrivermodle.mapper.AreaMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

	@Autowired
	private AreaMapper areaDao;
	
	
	@Test
	public void queryArea() {
		List<Area> areas = areaDao.queryArea();
		
		System.out.println("1111="+areas.size());
		assertEquals(2, areas.size());
	}
	@Test
	public void queryAreaById() {
		
	}
	@Test
	public void insertArea() {
		
	}
	@Test
	public void updateArea() {
		
	}
	
	public void deleteArea() {
		
	}
}
