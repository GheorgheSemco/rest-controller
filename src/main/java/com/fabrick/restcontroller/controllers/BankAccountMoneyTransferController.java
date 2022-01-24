package com.fabrick.restcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabrick.restcontroller.beans.BankAccountMoneyTransfer;
import com.fabrick.restcontroller.services.BankAccountMoneyTransferService;

@RestController
public class BankAccountMoneyTransferController {
	
	@Autowired
	private BankAccountMoneyTransferService bankAccountMoneyTransferService;

	@PostMapping("/transfer")
	public Object postTransfer(@RequestBody BankAccountMoneyTransfer bankAccountMoneyTransfer) {
		return bankAccountMoneyTransferService.doTransfer(bankAccountMoneyTransfer);
	}
	
}
