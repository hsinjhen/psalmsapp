package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CorporateSellerRepresentative implements Serializable {
	private Long id;
	private String name;
	private String position;
	private String billingAddress;
	private String mobileNumber;
	private String tinNumber;

	public CorporateSellerRepresentative() {
		super();
	}

	public CorporateSellerRepresentative(String name, String position,
			String billingAddress, String mobileNumber, String tinNumber) {
		super();
		this.name = name;
		this.position = position;
		this.billingAddress = billingAddress;
		this.mobileNumber = mobileNumber;
		this.tinNumber = tinNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	@Override
	public String toString() {
		return "CorporateSellerRepresentative [id=" + id + ", name=" + name
				+ ", position=" + position + ", billingAddress="
				+ billingAddress + ", mobileNumber=" + mobileNumber
				+ ", tinNumber=" + tinNumber + "]";
	}

}
