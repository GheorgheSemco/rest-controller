package com.fabrick.restcontroller.beans;

public class TypeTransaction {
	
	private String enumeration;
	private String value;
	
	public TypeTransaction(String enumeration, String value) {
		super();
		this.enumeration = enumeration;
		this.value = value;
	}

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
