package com.beyondli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ChildeurekamoduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChildeurekamoduleApplication.class, args);
	}
}
