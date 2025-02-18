package com.example.Student_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@EnableJpaRepositories(basePackages = "com.example.Student-demo.repository") // Ensure repositories are scanned
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StudentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDemoApplication.class, args);
	}

}
