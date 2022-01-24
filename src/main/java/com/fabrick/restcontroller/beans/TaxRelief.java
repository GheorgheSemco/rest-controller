package com.fabrick.restcontroller.beans;

public class TaxRelief {
	
	private String taxReliefId;
	private String creditorFiscalCode;
	private String beneficiaryType;
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
	private LegalPersonBeneficiary legalPersonBeneficiary;
	 
	public TaxRelief(String taxReliefId, String creditorFiscalCode, String beneficiaryType,
			NaturalPersonBeneficiary naturalPersonBeneficiary, LegalPersonBeneficiary legalPersonBeneficiary) {
		super();
		this.taxReliefId = taxReliefId;
		this.creditorFiscalCode = creditorFiscalCode;
		this.beneficiaryType = beneficiaryType;
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}

	public String getTaxReliefId() {
		return taxReliefId;
	}

	public void setTaxReliefId(String taxReliefId) {
		this.taxReliefId = taxReliefId;
	}

	public String getCreditorFiscalCode() {
		return creditorFiscalCode;
	}

	public void setCreditorFiscalCode(String creditorFiscalCode) {
		this.creditorFiscalCode = creditorFiscalCode;
	}

	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
		return naturalPersonBeneficiary;
	}

	public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
	}

	public LegalPersonBeneficiary getLegalPersonBeneficiary() {
		return legalPersonBeneficiary;
	}

	public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}
	 
	 
}
