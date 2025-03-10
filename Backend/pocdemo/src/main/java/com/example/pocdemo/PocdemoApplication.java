package com.example.pocdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocdemoApplication.class, args);
		System.out.println("\n--------------------- START SERVER -----------------------\n");
		System.out.println("Running on http://localhost:8080!");
		System.out.println("Access to http://localhost:8080/api/accommodations to get all accommodation in db!");
	}

}
