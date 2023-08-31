package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	@GetMapping("/get")
	public String show() {
		return "Hello World!";
	}
	
	@GetMapping("/set")
	public String disp() {
		return "Hello Tanmay!";
	}
}
