package com.benli.todo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Todo3Application {

	@RequestMapping(value = "/sayHello", method= RequestMethod.GET)
	public String sayHello() {
		return "hiya!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Todo3Application.class, args);
	}

}
