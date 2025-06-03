package com.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	
	@GetMapping(value="/course")
	public String getCourseDetails(@RequestParam(value="name",defaultValue = "SBMS") String name) {

		String msg = " ";

		if ("SBMS".equals(name)) {
			msg = "New Batch from SBMS 15-July-2021";
		} else if ("JRTP".equals(name)) {
			msg = "New Batch from JRTP 16-July-2021";
		} else if ("AWS".equals(name)) {
			msg = "New Batch from AWS 17-July-2021";
		} else {
			msg = "please visit akash.com";
		}

		return msg;
	}
	
	@GetMapping("/fee")
	public String getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname")String tname) {
		
		String msg = cname + " BY " + tname + " is 5000 INR only";
		return msg;
	}
}
