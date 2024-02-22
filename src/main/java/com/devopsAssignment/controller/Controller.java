package com.devopsAssignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get")
	public String getMapping()
	{
		//HelloWorld
		return "Spring App Working";
	}
	
}
