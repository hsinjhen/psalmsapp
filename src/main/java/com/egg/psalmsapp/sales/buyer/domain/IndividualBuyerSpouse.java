package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class IndividualBuyerSpouse implements Serializable {
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date birthDate;
	private String placeOfBirth;
	private String citizenship;
	private String religion;
	private String tinNumber;
	private String mobileNumber;
	private String emailAddress;
	private Passport passport;

	public IndividualBuyerSpouse() {
		super();
	}

	public IndividualBuyerSpouse(String firstName, String lastName,
			String middleName, Date birthDate, String placeOfBirth,
			String citizenship, String religion, String tinNumber,
			String mobileNumber, String emailAddress, Passport passport) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.placeOfBirth = placeOfBirth;
		this.citizenship = citizenship;
		this.religion = religion;
		this.tinNumber = tinNumber;
		this.mobileNumber = mobileNumber;
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

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
		return "IndividualBuyerSpouse [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleName=" + middleName
				+ ", birthDate=" + birthDate + ", placeOfBirth=" + placeOfBirth
				+ ", citizenship=" + citizenship + ", religion=" + religion
				+ ", tinNumber=" + tinNumber + ", mobileNumber=" + mobileNumber
				+ ", emailAddress=" + emailAddress + ", passport=" + passport
				+ "]";
	}

}
