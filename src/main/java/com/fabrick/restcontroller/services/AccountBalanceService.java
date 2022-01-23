package com.fabrick.restcontroller.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountBalanceService {
	
	public Object getBalance() {
		// create an instance of RestTemplate
		RestTemplate restTemplate = new RestTemplate();
		
		// url requested
		String url= "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/{accountId}/balance";
		
		// create the headers
		HttpHeaders headers = new HttpHeaders();
		headers.set("Auth-Schema", "S2S");
		headers.set("apikey", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
		
		//create the request for the headers
		HttpEntity<Void> request = new HttpEntity<Void>(headers);

		//make the HTTP GET request
		ResponseEntity<Object> response = restTemplate.exchange(
				url, 
				HttpMethod.GET, 
				request, 
				Object.class,
				"14537780"
		);
		
		//check control for the response
		if (response.getStatusCode() == HttpStatus.OK) {
		    System.out.println("Request Successful.");
		    System.out.println(response.getBody());
		} else {
		    System.out.println("Request Failed");
		    System.out.println(response.getStatusCode());
		}
		
		return response.getBody();
	}
}
