package com.vwits.resourcemgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ResourceManagementApp {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApp.class, args);
	}

}
