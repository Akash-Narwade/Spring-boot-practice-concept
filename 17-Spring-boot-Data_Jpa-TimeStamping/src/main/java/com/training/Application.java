package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.repository.InsurancePlanRepository;
import com.training.service.InsuranceService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        InsuranceService insuranceService = context.getBean(InsuranceService.class);
        insuranceService.savePlan();
		context.close();

	}

}
