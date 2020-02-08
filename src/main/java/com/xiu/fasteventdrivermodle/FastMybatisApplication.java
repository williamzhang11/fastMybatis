package com.xiu.fasteventdrivermodle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiu.fasteventdrivermodle.mapper")
public class FastMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastMybatisApplication.class, args);
	}

}
