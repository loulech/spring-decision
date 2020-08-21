package com.meituan.sankuai.decisions.module.datadecisions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(value = {"com.meituan.sankuai.decisions.module.datadecisions"})
public class DataDecisionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDecisionsApplication.class, args);
	}

}
