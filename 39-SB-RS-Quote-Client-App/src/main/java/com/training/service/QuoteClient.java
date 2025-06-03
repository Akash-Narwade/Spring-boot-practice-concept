package com.training.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.props.AppProperties;
import com.training.response.QuoteApiResponse;

@Service
public class QuoteClient {
	
	@Autowired
	private AppProperties  appProperties;

	@SuppressWarnings("deprecation")
	public String invokeRamdomAQuoteApi() {
		
		Map<String, String> messages = appProperties.getMessages();
		String apiUrl = messages.get("quoteApiUrl");
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
		int statusCode = responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			String body= responseEntity.getBody();
			System.out.println(body);
			return body;
		}else {
			System.out.println("UnSuccessfully");
			return null;
		}
	}
	
	@SuppressWarnings("deprecation")
	public String invokeQuoteApi() {
		String apiUrl = "https://jsonplaceholder.typicode.com/posts";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<QuoteApiResponse>> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<QuoteApiResponse>>() {
				});
		
		int statusCode = responseEntity.getStatusCodeValue();
		if (statusCode == 200 && responseEntity.getBody() != null && !responseEntity.getBody().isEmpty()) {
			String title = responseEntity.getBody().get(0).getTitle();
			System.out.println(title);
			return title.toUpperCase();
		} else {
			System.out.println("Request failed or empty body.");
			return null;
		}
	}

}
