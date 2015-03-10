package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CorporateSeller implements Serializable {
	private Long id;
	private IndividualSeller individualSeller;
	private CorporateSellerRepresentative representative;
	private Realty realty;
	private String alternatePayee;
	private String broker;
	private String salesManager;
	private String salesConsultant;
	private String companyTinNumber;

	public CorporateSeller() {
		super();
	}

	public CorporateSeller(IndividualSeller individualSeller,
			CorporateSellerRepresentative representative, Realty realty,
			String alternatePayee, String broker, String salesManager,
			String salesConsultant, String companyTinNumber) {
		super();
		this.individualSeller = individualSeller;
		this.representative = representative;
		this.realty = realty;
		this.alternatePayee = alternatePayee;
		this.broker = broker;
		this.salesManager = salesManager;
		this.salesConsultant = salesConsultant;
		this.companyTinNumber = companyTinNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IndividualSeller getIndividualSeller() {
		return individualSeller;
	}

	public void setIndividualSeller(IndividualSeller individualSeller) {
		this.individualSeller = individualSeller;
	}

	public CorporateSellerRepresentative getRepresentative() {
		return representative;
	}

	public void setRepresentative(CorporateSellerRepresentative representative) {
		this.representative = representative;
	}

	public Realty getRealty() {
		return realty;
	}

	public void setRealty(Realty realty) {
		this.realty = realty;
	}

	public String getAlternatePayee() {
		return alternatePayee;
	}

	public void setAlternatePayee(String alternatePayee) {
		this.alternatePayee = alternatePayee;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getSalesManager() {
		return salesManager;
	}

	public void setSalesManager(String salesManager) {
		this.salesManager = salesManager;
	}

	public String getSalesConsultant() {
		return salesConsultant;
	}

	public void setSalesConsultant(String salesConsultant) {
		this.salesConsultant = salesConsultant;
	}

	public String getCompanyTinNumber() {
		return companyTinNumber;
	}

	public void setCompanyTinNumber(String companyTinNumber) {
		this.companyTinNumber = companyTinNumber;
	}

	@Override
	public String toString() {
		return "CorporateSeller [id=" + id + ", individualSeller="
				+ individualSeller + ", representative=" + representative
				+ ", realty=" + realty + ", alternatePayee=" + alternatePayee
				+ ", broker=" + broker + ", salesManager=" + salesManager
				+ ", salesConsultant=" + salesConsultant
				+ ", companyTinNumber=" + companyTinNumber + "]";
	}

}
