package com.fabrick.restcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fabrick.restcontroller.services.BankAccountBalanceService;

@RestController
public class BankAccountBalanceController {

	@Autowired
	private BankAccountBalanceService bankAccountBalanceService;
	
	@GetMapping("/balance")
	public Object seeAccount() {
		return bankAccountBalanceService.getBalance();
	}
}
