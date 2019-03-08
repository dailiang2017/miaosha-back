package com.dail.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.dail.miaosha.mapper")
public class SeckillServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillServiceApplication.class, args);
	}

}
