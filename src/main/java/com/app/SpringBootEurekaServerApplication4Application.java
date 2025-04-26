package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication4Application.class, args);
		System.out.println("SpringBootEurekaServerApplication4Application is started..");
	}

}
