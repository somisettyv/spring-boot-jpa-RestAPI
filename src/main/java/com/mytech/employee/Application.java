package com.mytech.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mytech.employee.service.EmplomentService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {
	
	@Autowired
	EmplomentService emplomentService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
}