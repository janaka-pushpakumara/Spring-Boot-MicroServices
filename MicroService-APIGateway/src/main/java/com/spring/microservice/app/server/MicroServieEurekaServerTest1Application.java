package com.spring.microservice.app.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class MicroServieEurekaServerTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServieEurekaServerTest1Application.class, args);
	}

}
