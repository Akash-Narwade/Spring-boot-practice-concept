package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody
	public String getCourceDtls(String cname, String trainer) {

		if (cname.equals("SBMS")) {
			String msg = cname + " By " + trainer + " starting from 23 -JULY IST";
			return msg;
		} else if (cname.equals("JRTP")) {
			String msg = cname + " By " + trainer + " starting from 27 -JULY IST";
			return msg;
		}
		return "Contact Admin team";
	}

}
