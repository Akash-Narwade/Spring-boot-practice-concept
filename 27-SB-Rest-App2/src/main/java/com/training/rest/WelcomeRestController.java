package com.training.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeRestController {

	/*
	 * @GetMapping("/welcome") public String getWelcomeMsg() { String msg =
	 * "Welcome to Akash IT"; return msg;
	 * 
	 * }
	 */

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome to Akash IT!!!!!!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
