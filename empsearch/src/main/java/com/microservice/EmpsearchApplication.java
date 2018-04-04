package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EmpsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpsearchApplication.class, args);
	}
}
