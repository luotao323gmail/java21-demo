package com.example.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		System.out.println(123);
		SpringApplication.run(Spring1Application.class, args);
	}

}
