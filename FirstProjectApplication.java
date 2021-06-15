package com.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@SpringBootApplication
@RestController

public class FirstProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello Human";
	}
	 @RequestMapping("/name=")
	    public String index(@RequestParam(value="name", required=false) String searchQuery) {
	        return "You searched for: " + searchQuery;
	}
 }