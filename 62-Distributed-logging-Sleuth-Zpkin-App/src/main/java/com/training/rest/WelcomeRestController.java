package com.training.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping(value = "/welcome")
	public String getWelcomeMsg() {
		logger.info("*******Get getWelcomeMsget execution start");
		String msg = "Welcome to Ashoke It!!!";
		logger.info("*******Get getWelcomeMsget execution end");
		return msg;
	}
}
