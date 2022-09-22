package com.mindtree.orchard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurakaserver12Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurakaserver12Application.class, args);
	}

}
