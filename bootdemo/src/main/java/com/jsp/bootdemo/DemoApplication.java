package com.jsp.bootdemo;

import org.springframework.boot.SpringApplication;import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

 
@SpringBootApplication (scanBasePackages = "com.jsp") // specify the package name of our rest controller
@EnableJpaRepositories(basePackages = "com.jsp.bootdemo.repositary") // specify the package name of repositories to spring boot
@EntityScan(basePackages = "com.jsp.bootdemo.dto")// specify the location (package name ) of out entity classes to spring boot
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

} 
