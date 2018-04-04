package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EmpconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpconfigserverApplication.class, args);
	}
}
