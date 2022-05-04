package com.example.demo.configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Welcome User!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin!!";
	}
}
