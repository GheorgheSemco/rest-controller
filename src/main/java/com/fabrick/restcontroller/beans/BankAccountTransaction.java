package com.fabrick.restcontroller.beans;

import java.util.ArrayList;
import java.util.List;


public class BankAccountTransaction{
	
	private List<TransactionList> list;
	
	public BankAccountTransaction() {}

	public BankAccountTransaction(ArrayList<TransactionList> list) {
		super();
		this.list = list;
	}

	public List<TransactionList> getList() {
		return list;
	}

	public void setList(ArrayList<TransactionList> list) {
		this.list = list;
	}
	
}
