package com.training.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.props.AppProperties;

@RestController
public class WelcomeRestController {

	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		Map<String, String> messages = appProperties.getMessages();
		String msgValue=messages.get("welcomeMsg");
		return msgValue;
	}
	
	
	@GetMapping("/greet")
	public String greetMsg() {
		Map<String, String> messages = appProperties.getMessages();
		String greetValue=messages.get("greetMsg");
		return greetValue;
	}


}
