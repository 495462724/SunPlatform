package com.sgx.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.sgx.platform.domain")
@ServletComponentScan
@SpringBootApplication
public class SunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunApplication.class, args);
	}

}
