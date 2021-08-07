package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // it is equal to @ComponentScan @Configuration @AutoConfiguration

public class Sts1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Sts1Application.class, args);
		System.out.println("sprint demo");
	}

}
