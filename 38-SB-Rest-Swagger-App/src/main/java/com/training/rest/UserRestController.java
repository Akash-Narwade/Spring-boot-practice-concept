package com.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping(value = "/user/{userId}")
	public String getUser(@PathVariable Integer userId) {
		if (userId == 100) {
			return "User11";
		} else if (userId == 101) {
			return "User22";
		} else {
			return "User Not Available";
		}
	}

}
