package com.fabrick.restcontroller.beans;

public class Address {
	
	private String address;
	private String city;
	private String countryCode;
	
	public Address(String address, String city, String countryCode) {
		super();
		this.address = address;
		this.city = city;
		this.countryCode = countryCode;
	}

	public Object getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Object getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Object getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
