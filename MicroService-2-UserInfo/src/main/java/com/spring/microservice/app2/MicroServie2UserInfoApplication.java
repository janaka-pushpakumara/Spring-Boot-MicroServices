package com.spring.microservice.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServie2UserInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServie2UserInfoApplication.class, args);
	}

}
