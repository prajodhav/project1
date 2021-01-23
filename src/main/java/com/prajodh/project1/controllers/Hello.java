package com.prajodh.project1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping ("/hello")
	public String sayHello() {
		System.out.println("Running now1 --- changed by Anu and put in Branch 1");
		return "<h1>Hello World</h1>";
	}
}
