package com.moon.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.moon.study.dao"})
public class MoonSpringBootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoonSpringBootStudyApplication.class, args);
	}

}
