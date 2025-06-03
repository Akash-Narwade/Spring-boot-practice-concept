 package com.training.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.binding.Customer;

@RestController
public class CustomerRestController {
	
	@PutMapping(value="/update",consumes = {"application/json"})
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
		//logic to update customer in DB
		System.out.println(customer);
		return new ResponseEntity<>("Update SuccessFully",HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/delete/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) {
		// logic to delete customer in DB
		System.out.println(customerId);
		return new ResponseEntity<>("Delete SuccessFully", HttpStatus.OK);
	}
 
}
