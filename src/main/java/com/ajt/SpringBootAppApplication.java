package com.ajt;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {
	
	@PostConstruct
	public void init() {
		System.out.println("Initializinf resources..");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		System.out.println("Application started.");
	}

}
