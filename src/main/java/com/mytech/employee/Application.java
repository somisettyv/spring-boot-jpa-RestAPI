package com.mytech.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mytech.employee.service.EmplomentService;

@SpringBootApplication
public class Application {
	
	@Autowired
	EmplomentService emplomentService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
}