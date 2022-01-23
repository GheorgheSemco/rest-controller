package com.fabrick.restcontroller.beans;

public class BankAccountBalance{
	
	private String date;
	private double balance;
	private double availableBalance;
	private String currency;
	
	public BankAccountBalance() {};
	
	public BankAccountBalance(String date, double balance, double availableBalance, String currency) {
		super();
		this.date = date;
		this.balance = balance;
		this.availableBalance = availableBalance;
		this.currency = currency;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "BankAccountBalance [date=" + date + ", balance=" + balance + ", availableBalance=" + availableBalance
				+ ", currency=" + currency + "]";
	}
	
	
	
}
