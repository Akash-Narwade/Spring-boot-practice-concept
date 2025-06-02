package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@GetMapping("/price/{carName}")
	@ResponseBody
	public String getCarPrice(@PathVariable("carName") String str) {
		String msg = str + "Car prices is 7.8 Lakhs";
		return msg;
	}
	
	
	@GetMapping("/check/{carName}/{location}/{branch}")
	@ResponseBody
	public String checkDtls(String carName,String location,String branch) {
		String responseMessage="IN "+location+"+:: location+" +branch+ " Branch Name" +carName +"Are available here";
		return responseMessage;
	}
}
