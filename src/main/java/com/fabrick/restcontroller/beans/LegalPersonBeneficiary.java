package com.fabrick.restcontroller.beans;

public class LegalPersonBeneficiary {
	
	private String fiscalCode;
	private String legalRepresentativeFiscalCode;
	
	public LegalPersonBeneficiary(String fiscalCode, String legalRepresentativeFiscalCode) {
		super();
		this.fiscalCode = fiscalCode;
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
	}

	public Object getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public Object getLegalRepresentativeFiscalCode() {
		return legalRepresentativeFiscalCode;
	}

	public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
	}
	
	
}
