package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class CommunityTaxCertificateNumber implements Serializable {
	private Long id;
	private String ctcNumber;
	private Date dateIssued;
	private String placeIssued;

	public CommunityTaxCertificateNumber() {
		super();
	}

	public CommunityTaxCertificateNumber(String ctcNumber, Date dateIssued,
			String placeIssued) {
		super();
		this.ctcNumber = ctcNumber;
		this.dateIssued = dateIssued;
		this.placeIssued = placeIssued;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCtcNumber() {
		return ctcNumber;
	}

	public void setCtcNumber(String ctcNumber) {
		this.ctcNumber = ctcNumber;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public String getPlaceIssued() {
		return placeIssued;
	}

	public void setPlaceIssued(String placeIssued) {
		this.placeIssued = placeIssued;
	}

	@Override
	public String toString() {
		return "CommunityTaxCertificateNumber [id=" + id + ", ctcNumber="
				+ ctcNumber + ", dateIssued=" + dateIssued + ", placeIssued="
				+ placeIssued + "]";
	}

}
