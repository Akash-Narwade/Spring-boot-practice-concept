package com.training.rest;

import java.awt.PageAttributes.MediaType;
import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.training.domain.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/getEvent", produces = "application/json")
	public ResponseEntity<Mono<CustomerEvent>> getCustomerEvent() {

		CustomerEvent event = new CustomerEvent("Akash", new Date());
		
		//Convert java object into mono object 
		Mono<CustomerEvent> customerMono = Mono.just(event);

		ResponseEntity<Mono<CustomerEvent>> responseEntity = new ResponseEntity<Mono<CustomerEvent>>(customerMono,
				HttpStatus.OK);
		return responseEntity;
	}
	
	
	@GetMapping(value = "/getEvents", produces = org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getCustomerEvents() {

		//Create Pojo with Data
		CustomerEvent event = new CustomerEvent("Vinay", new Date());
		
		//Create Stream Object to Send Data
		Stream<CustomerEvent> customerStream=Stream.generate(()->event);
		
		//Given Stream Object to flux Object
		Flux<CustomerEvent> fromStream = Flux.fromStream(customerStream);
		
		//Setting response Interval
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
		
		//Combining IntervalFlux and CustomerEvent
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(interval, fromStream);
		
		//Getting Second Tuple value as Flux Object
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		
		//Adding Flux Object to Response Bodu
		ResponseEntity<Flux<CustomerEvent>> resEntity = new ResponseEntity<Flux<CustomerEvent>>(fluxMap,
				HttpStatus.OK);
		
		return resEntity;
	}

}
