package com.training.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.bindings.User;

@RestController
public class UserRestController {
	
	@PostMapping(value = "/saveUser", consumes = { "application/json", "application/xml" })
	public String addUser(@RequestBody User user) {
		/*
		 * User u = new User(); u.setUid(101); u.setFname("Akash");
		 * u.setLname("Narwade"); u.setEmail("narwadeakash@gmail.com");
		 */
		System.out.println(user);
		String msg = "User Saved Successfully";
		return msg;
	}

}
