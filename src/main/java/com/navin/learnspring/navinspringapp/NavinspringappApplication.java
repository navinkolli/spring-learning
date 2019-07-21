package com.navin.learnspring.navinspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class NavinspringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NavinspringappApplication.class, args);
	}

	@RequestMapping("/hello")
	public String methodName() {
	    return "started";
    }

    @RequestMapping("/welcome")
    public String welcometest() {
        return "testerarted";
    }



}
