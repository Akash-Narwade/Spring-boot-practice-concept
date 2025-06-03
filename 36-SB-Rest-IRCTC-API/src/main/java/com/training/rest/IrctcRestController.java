package com.training.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.training.request.PassengerRequest;
import com.training.response.TicketResponse;

import ch.qos.logback.core.status.Status;

@RestController
public class IrctcRestController {

	@PostMapping(value = "/bookTicket",
			consumes = { "application/json", "application/xml" },
			produces = { "application/xml","application/json" })
	public ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request) {
		// Logic to book the ticket
		TicketResponse response = new TicketResponse();
		response.setStatus("CONFIRMED");
		response.setPrice(1500.00);
		BeanUtils.copyProperties(request, response);
		ResponseEntity<TicketResponse> responseEntity = new ResponseEntity<>(response,HttpStatus.CREATED);
		return responseEntity;
	}

}
