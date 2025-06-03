package com.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.service.QuoteClient;

@RestController
public class QuoteRestController {
        
	@Autowired
	public QuoteClient  quoteClient;
	
	@GetMapping("/quote")
	public String getQuote() {
		String quote =quoteClient.invokeRamdomAQuoteApi();
		return quote;
	}
	
	@GetMapping("/quotes")
	public String getQuotes() {
		String quote =quoteClient.invokeQuoteApi();
		return quote;
	}
}
