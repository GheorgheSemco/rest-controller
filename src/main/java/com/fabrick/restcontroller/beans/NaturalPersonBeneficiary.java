package com.fabrick.restcontroller.beans;

public class NaturalPersonBeneficiary {
	
	private String fiscalCode1;
	private String fiscalCode2;
	private String fiscalCode3;
	private String fiscalCode4;
	private String fiscalCode5;
	
	public NaturalPersonBeneficiary(String fiscalCode1, String fiscalCode2, String fiscalCode3, String fiscalCode4,
			String fiscalCode5) {
		super();
		this.fiscalCode1 = fiscalCode1;
		this.fiscalCode2 = fiscalCode2;
		this.fiscalCode3 = fiscalCode3;
		this.fiscalCode4 = fiscalCode4;
		this.fiscalCode5 = fiscalCode5;
	}

	public String getFiscalCode1() {
		return fiscalCode1;
	}

	public void setFiscalCode1(String fiscalCode1) {
		this.fiscalCode1 = fiscalCode1;
	}

	public Object getFiscalCode2() {
		return fiscalCode2;
	}

	public void setFiscalCode2(String fiscalCode2) {
		this.fiscalCode2 = fiscalCode2;
	}

	public Object getFiscalCode3() {
		return fiscalCode3;
	}

	public void setFiscalCode3(String fiscalCode3) {
		this.fiscalCode3 = fiscalCode3;
	}

	public Object getFiscalCode4() {
		return fiscalCode4;
	}

	public void setFiscalCode4(String fiscalCode4) {
		this.fiscalCode4 = fiscalCode4;
	}

	public Object getFiscalCode5() {
		return fiscalCode5;
	}

	public void setFiscalCode5(String fiscalCode5) {
		this.fiscalCode5 = fiscalCode5;
	}
	
	
}
