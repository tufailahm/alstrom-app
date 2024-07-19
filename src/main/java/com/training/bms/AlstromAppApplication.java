package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlstromAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlstromAppApplication.class, args);
		System.out.println("Alstrom app started on Tuesday");
		System.out.println("Rutika changes some code..");
	}
}