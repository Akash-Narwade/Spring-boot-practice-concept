package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.service.ReportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 ReportService service=context.getBean(ReportService.class);
		 service.generateReport();
	}

}
