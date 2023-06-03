package com.example.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class PatientserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientserviceApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
}
