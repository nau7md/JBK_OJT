package com.javabykiran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@GetMapping("/msg")
	public String getAll() {

		return "Hi, This is the first srping boot project";

	}
	@GetMapping("/getvalue")
	public int getValue() {
		return 8+2;
	}


}
