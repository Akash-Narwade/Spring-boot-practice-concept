package com.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.client.GreetClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetClient greetClient;

	
	@GetMapping("/welcome")
	public String welcome() {
		String msg = "Welcome Akash!!";
		String greetMsg = greetClient.invokeGreetApi();
		return greetMsg + " " + msg;
	}
}
