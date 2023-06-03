package com.circuitBreaker.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping
public class Controller {
	@Autowired
	RestTemplate template;
	
	@GetMapping("/test1")
	@CircuitBreaker(name = "test1service", fallbackMethod = "fallback")
	public String test() {
	    return this.template.getForObject("http://localhost:8080/testing", String.class);
}
}
