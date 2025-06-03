package com.training.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class QuoteService {

	public String invokeQuoteApi() {
		String apiUrl = "https://dummyjson.com/quotes";
		
		WebClient webClient = WebClient.create();
				       webClient.get()
								.uri(apiUrl)
								.retrieve()
								.bodyToMono(String.class)
								.subscribe(QuoteService::handleResponse);
		System.out.println("*****Subscribe is used for handling the response Data******");
		return "Success";
	}
	
	
	public static void handleResponse(String resData) {
		System.out.println(resData);
		System.out.println("Response Pushed to Apache Kafka");
	}

}
