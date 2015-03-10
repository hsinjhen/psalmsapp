package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Passport implements Serializable {
	private Long id;
	private String passportNumber;
	private String placeIssued;
	private Date dateIssued;

	public Passport() {
		super();
	}

	public Passport(String passportNumber, String placeIssued, Date dateIssued) {
		super();
		this.passportNumber = passportNumber;
		this.placeIssued = placeIssued;
		this.dateIssued = dateIssued;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPlaceIssued() {
		return placeIssued;
	}

	public void setPlaceIssued(String placeIssued) {
		this.placeIssued = placeIssued;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber
				+ ", placeIssued=" + placeIssued + ", dateIssued=" + dateIssued
				+ "]";
	}

}
