package com.fabrick.restcontroller.beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BankAccountTransaction extends BankAccount {
	
	private LocalDate fromAccountingDate = formatDate();
	private LocalDate toAccountingDate = formatDate();
	
	public BankAccountTransaction() {}

    public BankAccountTransaction(LocalDate fromDate, LocalDate toDate) {
        this.fromAccountingDate = fromDate;
        this.toAccountingDate = toDate;
    }
    
    public LocalDate formatDate() {
    	String longDate = "April 1, 2019";
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
    	LocalDate date = LocalDate.parse(longDate, formatter);
    	System.out.println(date);
    	return date;
    }
	
	public LocalDate getFromAccountingDate() {
		return fromAccountingDate;
	}
	
	public void setFromAccountingDate(LocalDate fromAccountingDate) {
		this.fromAccountingDate = fromAccountingDate;
	}
	
	public LocalDate getToAccountingDate() {
		return toAccountingDate;
	}
	
	public void setToAccountingDate(LocalDate toAccountingDate) {
		this.toAccountingDate = toAccountingDate;
	}
	
}
