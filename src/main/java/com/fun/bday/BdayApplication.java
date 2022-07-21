package com.fun.bday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdayApplication.class, args);
	}

}
