package com.vminger.prophet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProphetEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProphetEurekaServerApplication.class, args);
	}
}
