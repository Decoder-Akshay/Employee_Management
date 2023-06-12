package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.employee.repository")   
@ComponentScan(basePackages = {"com.employee.service"})
@EntityScan("com.employee.entity")
public class EmployeemanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanageApplication.class, args);
	}

}
