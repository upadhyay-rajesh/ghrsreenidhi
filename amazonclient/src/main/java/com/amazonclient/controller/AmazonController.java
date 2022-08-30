package com.amazonclient.controller;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AmazonController {
	
	
	@GetMapping("displayallproductdetails")
	public String displayAllProduct() {
		String baseUrl = "http://localhost:10000/showAllProduct";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,	HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		return response.getBody();
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		return new HttpEntity(headers);
	}
	
	
}












