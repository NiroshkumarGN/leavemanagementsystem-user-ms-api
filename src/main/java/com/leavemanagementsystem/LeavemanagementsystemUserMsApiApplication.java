package com.leavemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDiscoveryClient
@SpringBootApplication
public class LeavemanagementsystemUserMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeavemanagementsystemUserMsApiApplication.class, args);
	}

}