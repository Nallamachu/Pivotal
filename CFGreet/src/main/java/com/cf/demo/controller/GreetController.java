package com.cf.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping(path = "/greet/{name}")
	public String greetWithName(@PathVariable String name) {

		return "Hello " + name + "... Welcome to Cloud Foundry :)";

	}
	
	@GetMapping(path = "/greet/")
	public String greetWithName() {

		return "Hello Pivotal... Welcome to Cloud Foundry :)";

	}

}
