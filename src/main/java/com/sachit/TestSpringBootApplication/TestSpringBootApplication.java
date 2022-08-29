package com.sachit.TestSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class TestSpringBootApplication {

	@GetMapping("/welcome")
	public String display(){
		return "You are welcome";
	}


	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootApplication.class, args);
	}

}
