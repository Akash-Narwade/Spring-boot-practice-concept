package com.training.service;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.config.RestTemplateConfig;
import com.training.request.PassengerRequest;
import com.training.response.TicketResponse;

@Service
public class TicketService {
	
	@Autowired
	private RestTemplate rt;
	
	public TicketResponse intiateTicketBookProcess(PassengerRequest requestData) {
		
		///In Service Layer I have rest client logic
		
		String endPointUrl = "http://localhost:9090/bookTicket";
		//RestTemplate rt= new RestTemplate();
		
		//Set HttpHeader
		//HttpHeaders headers= new HttpHeaders();
		//headers.set("Content-Type","application/json");
		//headers.set("Accept","application/json");
		
		//HttpEntity<PassengerRequest> request=new HttpEntity<>(requestData,headers);

		
		ResponseEntity<TicketResponse> postForEntity = rt.postForEntity(endPointUrl, requestData, TicketResponse.class);
		TicketResponse body = postForEntity.getBody();
		return body;
	}

}
