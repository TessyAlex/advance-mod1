package com.bootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/greet")     //  /greet is the endpoint
	public String message() {
		return "Ola, como sava";
	}
}
