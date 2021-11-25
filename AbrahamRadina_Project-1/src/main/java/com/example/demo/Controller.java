package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/exp")
	public Experience experience(@RequestBody Experience exp) {
		System.out.println(exp);
		return exp;
	}
}
