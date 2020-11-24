package com.vgb.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@SpringBootApplication
public class CloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoApplication.class, args);
	}


	@GetMapping("/greet")
	public String greet() {
		return "Hello!!! , the time right now is: " + Instant.now();
	}
}
