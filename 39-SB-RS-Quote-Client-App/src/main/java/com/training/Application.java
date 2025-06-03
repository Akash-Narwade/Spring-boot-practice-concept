package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.service.QuoteClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		/*
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		QuoteClient bean = context.getBean(QuoteClient.class);
		bean.invokeRamdomAQuoteApi();
		*/
	}

}
