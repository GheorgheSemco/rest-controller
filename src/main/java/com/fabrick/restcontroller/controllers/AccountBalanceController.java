package com.fabrick.restcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabrick.restcontroller.services.AccountBalanceService;

@RestController
public class AccountBalanceController {

	@Autowired
	private AccountBalanceService accountBalanceService;
	
	@GetMapping("/balance")
	public Object seeBalance() {
		return accountBalanceService.getBalance();
	}
}
