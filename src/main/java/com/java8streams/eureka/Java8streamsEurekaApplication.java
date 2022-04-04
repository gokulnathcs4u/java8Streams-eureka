package com.java8streams.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Java8streamsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8streamsEurekaApplication.class, args);
	}

}
