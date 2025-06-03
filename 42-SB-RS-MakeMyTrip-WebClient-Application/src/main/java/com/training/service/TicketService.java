package com.training.service;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.training.config.RestTemplateConfig;
import com.training.request.PassengerRequest;
import com.training.response.TicketResponse;

@Service
public class TicketService {
	
	public TicketResponse intiateTicketBookProcess(PassengerRequest requestData) {
		
		String endPointUrl = "http://localhost:9090/bookTicket";
		
		WebClient webClient = WebClient.create();
		
		TicketResponse ticket = webClient.post()
										.uri(endPointUrl)
										.body(requestData,PassengerRequest.class)
										.retrieve()
										.bodyToMono(TicketResponse.class)
										.block();
		return ticket;
	}

}
