package com.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.request.PassengerRequest;
import com.training.response.TicketResponse;
import com.training.service.TicketService;

@RestController
public class TicketBookingRestController {

	@Autowired
	private TicketService ticketService;

	@PostMapping("/book")
	public TicketResponse bookTicket(@RequestBody PassengerRequest request) {
		return ticketService.intiateTicketBookProcess(request);
	}

}
