package com.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	
	@GetMapping("/greet")
	public String greetMsg() {
		String msg="Welcome Greet Akash!!";
		return msg;
	}
}
