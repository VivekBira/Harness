package com.example.Harness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HarnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarnessApplication.class, args);
		System.out.println("we are running the java code in harness environment);
	}

}
