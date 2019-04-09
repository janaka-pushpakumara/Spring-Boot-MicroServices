package com.spring.microservice.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroServie1PersonInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServie1PersonInfoApplication.class, args);
	}

}
