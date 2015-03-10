package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ResidenceCertificate implements Serializable {
	private Long id;
	private String certificateNumber;
	private Date dateIssued;
	private String placeIssued;

	public ResidenceCertificate() {
		super();
	}

	public ResidenceCertificate(String certificateNumber, Date dateIssued,
			String placeIssued) {
		super();
		this.certificateNumber = certificateNumber;
		this.dateIssued = dateIssued;
		this.placeIssued = placeIssued;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
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
		return "ResidenceCertificate [id=" + id + ", certificateNumber="
				+ certificateNumber + ", dateIssued=" + dateIssued
				+ ", placeIssued=" + placeIssued + "]";
	}

}
