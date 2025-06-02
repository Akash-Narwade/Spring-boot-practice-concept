package com.training.controller;
import com.training.pojo.Plan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InsurancePlanController {
	
	@GetMapping("/plandata")
	@ResponseBody
	public Plan getPlanData() {
		Plan p= new Plan();
		p.setPlanId(101);
		p.setPlanName("Jeevan Sathi");
		p.setPlanStatus("Approved");
		
		return p;
	}

}
