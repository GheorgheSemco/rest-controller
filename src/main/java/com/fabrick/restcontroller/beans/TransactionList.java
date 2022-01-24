package com.fabrick.restcontroller.beans;

public class TransactionList {
	
	private String transactionId;
	private String operationId;
	private String accountingDate;
	private String valueDate;
	private TypeTransaction type;
	private int amount;
	private String currency;
	private String description;
	 
	public TransactionList(String transactionId, String operationId, String accountingDate, String valueDate,
			TypeTransaction type, int amount, String currency, String description) {
		super();
		this.transactionId = transactionId;
		this.operationId = operationId;
		this.accountingDate = accountingDate;
		this.valueDate = valueDate;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.description = description;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getOperationId() {
		return operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getAccountingDate() {
		return accountingDate;
	}
	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public TypeTransaction getType() {
		return type;
	}
	public void setType(TypeTransaction type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 
	 
}
