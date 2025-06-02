package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.binding.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/userForm")
	public String loadUserForm(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

	@PostMapping("/saveUser")
	public String saveUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg", "DataSaved Successfully");
		return "dashboard";
	}
}
