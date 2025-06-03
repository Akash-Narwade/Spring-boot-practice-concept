package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bindings.Customer;

@RestController
public class CustomerRestController {

	@GetMapping(value="/customer",produces= {"application/json"})
	public Customer getCustomerData() {
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Anil");
		customer.setCustomerPhno(96049480306L);
		return customer;
	}
}
