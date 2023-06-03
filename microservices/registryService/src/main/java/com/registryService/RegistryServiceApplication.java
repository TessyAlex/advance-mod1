package com.registryService;

//The registryService is our database or server. whatever happens, we should inform the registryService.
//we have used Eureka server, so we have given the annotation of Eureka which is specific, if any other server is used,
//then we need to use Discovery client and server which is generic.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}
}
