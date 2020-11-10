package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class MyControllerDemo {
	@GetMapping("/test")
	public String get() {
		return "server";
	}
}
