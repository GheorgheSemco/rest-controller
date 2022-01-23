package com.fabrick.restcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fabrick.restcontroller.services.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService bankAccountService;
	
	@GetMapping("/account")
	public Object seeAccount() {
		return bankAccountService.getAccount();
	}

}
