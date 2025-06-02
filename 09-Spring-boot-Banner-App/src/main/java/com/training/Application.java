package com.training;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

		// Java 8 Approach to work with runners
		ApplicationRunner appRunner = (obj) -> {
			System.out.println("I am from app runners  :: using lambda");
		};

		appRunner.run(null);
	}

}
