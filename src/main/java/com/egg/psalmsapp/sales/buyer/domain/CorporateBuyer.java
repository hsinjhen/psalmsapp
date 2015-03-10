package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CorporateBuyer implements Serializable {
	private Long id;
	private String corporationName;
	private String principalOffice;
	private String address;
	private String telephoneNumber;
	private String emailAddress;
	private CommunityTaxCertificateNumber communityTaxCertificateNumber;
	private String faxNumber;
	private String tinNumber;

	public CorporateBuyer() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	public String getPrincipalOffice() {
		return principalOffice;
	}

	public void setPrincipalOffice(String principalOffice) {
		this.principalOffice = principalOffice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public CommunityTaxCertificateNumber getCommunityTaxCertificateNumber() {
		return communityTaxCertificateNumber;
	}

	public void setCommunityTaxCertificateNumber(
			CommunityTaxCertificateNumber communityTaxCertificateNumber) {
		this.communityTaxCertificateNumber = communityTaxCertificateNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	@Override
	public String toString() {
		return "CorporateBuyer [id=" + id + ", corporationName="
				+ corporationName + ", principalOffice=" + principalOffice
				+ ", address=" + address + ", telephoneNumber="
				+ telephoneNumber + ", emailAddress=" + emailAddress
				+ ", communityTaxCertificateNumber="
				+ communityTaxCertificateNumber + ", faxNumber=" + faxNumber
				+ ", tinNumber=" + tinNumber + "]";
	}

}
