package com.cloud.client.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationThree {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationThree.class, args);
	}

}
