package com.loulech.dev.decision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
public class DataDecisionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDecisionsApplication.class, args);
	}

}
