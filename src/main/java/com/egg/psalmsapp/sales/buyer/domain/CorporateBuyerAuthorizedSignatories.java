package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class CorporateBuyerAuthorizedSignatories implements Serializable {
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String address;
	private String position;
	private String tinNumber;
	private Date birthDate;
	private String placeOfBirth;
	private CivilStatus civilStatus;
	private String telephoneNumber;
	private String emailAddress;
	private Passport passport;

	public CorporateBuyerAuthorizedSignatories() {
		super();
	}

	public CorporateBuyerAuthorizedSignatories(String firstName,
			String lastName, String middleName, String address,
			String position, String tinNumber, Date birthDate,
			String placeOfBirth, CivilStatus civilStatus,
			String telephoneNumber, String emailAddress, Passport passport) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.address = address;
		this.position = position;
		this.tinNumber = tinNumber;
		this.birthDate = birthDate;
		this.placeOfBirth = placeOfBirth;
		this.civilStatus = civilStatus;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.passport = passport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public CivilStatus getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(CivilStatus civilStatus) {
		this.civilStatus = civilStatus;
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

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "CorporateBuyerAuthorizedSignatories [id=" + id + ", firstName="
				+ firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", address=" + address + ", position="
				+ position + ", tinNumber=" + tinNumber + ", birthDate="
				+ birthDate + ", placeOfBirth=" + placeOfBirth
				+ ", civilStatus=" + civilStatus + ", telephoneNumber="
				+ telephoneNumber + ", emailAddress=" + emailAddress
				+ ", passport=" + passport + "]";
	}

}
