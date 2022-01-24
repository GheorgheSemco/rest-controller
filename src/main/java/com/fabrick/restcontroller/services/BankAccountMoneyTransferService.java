package com.fabrick.restcontroller.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fabrick.restcontroller.beans.Account;
import com.fabrick.restcontroller.beans.Address;
import com.fabrick.restcontroller.beans.BankAccountMoneyTransfer;
import com.fabrick.restcontroller.beans.Creditor;
import com.fabrick.restcontroller.beans.LegalPersonBeneficiary;
import com.fabrick.restcontroller.beans.NaturalPersonBeneficiary;
import com.fabrick.restcontroller.beans.TaxRelief;

@Service
public class BankAccountMoneyTransferService {

	public Object doTransfer(BankAccountMoneyTransfer bankAccountMoneyTransfer) {

		RestTemplate restTemplate = new RestTemplate();
		
		String url= "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/14537780/payments/money-transfers";
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Auth-Schema", "S2S");
		headers.set("apikey", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
		
		Address address = new Address(null,null,null);
		Account account = new Account("IT23A0336844430152923804660","SELBIT2BXXX");
		Creditor creditor = new Creditor("John Doe", account, address);
		NaturalPersonBeneficiary naturalPersonBeneficiary = new NaturalPersonBeneficiary(
				"MRLFNC81L04A859L",
				null,
				null,
				null,
				null
		);
		LegalPersonBeneficiary legalPersonBeneficiary = new LegalPersonBeneficiary(null,null);
		TaxRelief taxRelief = new TaxRelief(
				"L449",
				"56258745832",
				"NATURAL_PERSON",
				naturalPersonBeneficiary,
				legalPersonBeneficiary
		);
		
		BankAccountMoneyTransfer moneyTransfer = new BankAccountMoneyTransfer(
				creditor,
				"2019-04-01",
				"REMITTANCE_INFORMATION",
				"Payment invoice 75/2017",
				800,
				"EUR",
				"SHA",
				"45685475",
				taxRelief
		);
		
		HttpEntity<BankAccountMoneyTransfer> request = new HttpEntity<>(moneyTransfer,headers);
		
		ResponseEntity<Object> response = restTemplate.postForEntity(
				url, 
				request, 
				Object.class
		);
	
		return response.getBody();
	}
}
