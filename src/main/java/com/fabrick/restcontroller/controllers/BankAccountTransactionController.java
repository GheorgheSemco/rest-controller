package com.fabrick.restcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabrick.restcontroller.services.BankAccountTransactionService;

@RestController
public class BankAccountTransactionController {
	
	@Autowired
	private BankAccountTransactionService bankAccountTransactionService;
	
	@GetMapping("/transaction")
	public Object seeTransaction() {
		return bankAccountTransactionService.getTransactions();
	}
}
