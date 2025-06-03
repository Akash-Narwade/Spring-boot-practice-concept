package com.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	
	@GetMapping("/course/{a}/trainer/{b}")
	public String getCourseDetails(@PathVariable("a") String cname, @PathVariable("b") String tname) {
		String msg = cname + " BY " + tname + " is 5000 INR only!!!";
		return msg;
	}
}
