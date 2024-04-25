package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	
	
	@GetMapping("/welcome")
	
	
	public String getWelcomeController() {
		
		return "!!!!!!!!!!!!! Welcome from Springboot !!!!!!!!!!!!!!!!!!!";
		
		
	}

	@GetMapping("/java")
	
	
	public String getWelcomeController1() {
		
		return "!!!!!!!!!!!!! Welcome from Java !!!!!!!!!!!!!!!!!!!";
		
		
	}
	
	
	
	
	
}
