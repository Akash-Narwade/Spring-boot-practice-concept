package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.entity.InsurancePlan;
import com.training.repository.InsurancePlanRepository;

@Service
public class InsuranceService {
	
	@Autowired
	private InsurancePlanRepository insurancePlanRepository;
	
	public void savePlan() {
		InsurancePlan insurancePlan = new InsurancePlan();
		insurancePlan.setPlanName("SNAPCHAT");
		insurancePlan.setPlanStatus("Approved-1");
		insurancePlanRepository.save(insurancePlan);	
	}

}
