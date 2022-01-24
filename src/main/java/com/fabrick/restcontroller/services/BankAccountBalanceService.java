package com.fabrick.restcontroller.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fabrick.restcontroller.beans.BankAccountBalance;

@Service
public class BankAccountBalanceService {

	public Object getBalance() {
		RestTemplate restTemplate = new RestTemplate();

		String url= "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/{accountId}/balance";

		Map<String,String> params = new HashMap<String,String>();	
		params.put("accountId", "14537780");

		HttpHeaders headers = new HttpHeaders();
		headers.set("Auth-Schema", "S2S");
		headers.set("apikey", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
		HttpEntity<Void> request = new HttpEntity<Void>(headers);

		ResponseEntity<BankAccountBalance> response = restTemplate.exchange(	
				url, 	
				HttpMethod.GET, 
				request, 	
				BankAccountBalance.class,
				params
				
		);
		
		String responseMessage = response.getStatusCode() == HttpStatus.OK ? "Request Successful." : "Request Failed";			
		System.out.println(responseMessage);
		
		return response.getBody();
	}
}
