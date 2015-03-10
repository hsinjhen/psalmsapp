package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class IndividualBuyer implements Serializable {
	private Long id;
	private String clientId;
	private String firstName;
	private String lastName;
	private String mailingAddress;
	private String occupation;
	private String employerName;
	private String employerAddress;
	private String telephoneNumber;
	private String mobileNumber;
	private String officeTelephoneNumber;
	private String emailAddress;
	private Date birthDate;
	private CivilStatus civilStatus;
	private String citizenship;
	private String religion;
	private String tinNumber;
	private ResidenceCertificate residenceCertificate;
	private IndividualBuyerSpouse spouse;

	public IndividualBuyer() {
		super();
	}

	public IndividualBuyer(String clientId, String firstName, String lastName,
			String mailingAddress, String occupation, String employerName,
			String employerAddress, String telephoneNumber,
			String mobileNumber, String officeTelephoneNumber,
			String emailAddress, Date birthDate, CivilStatus civilStatus,
			String citizenship, String religion, String tinNumber,
			ResidenceCertificate residenceCertificate,
			IndividualBuyerSpouse spouse) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailingAddress = mailingAddress;
		this.occupation = occupation;
		this.employerName = employerName;
		this.employerAddress = employerAddress;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.officeTelephoneNumber = officeTelephoneNumber;
		this.emailAddress = emailAddress;
		this.birthDate = birthDate;
		this.civilStatus = civilStatus;
		this.citizenship = citizenship;
		this.religion = religion;
		this.tinNumber = tinNumber;
		this.residenceCertificate = residenceCertificate;
		this.spouse = spouse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
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

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOfficeTelephoneNumber() {
		return officeTelephoneNumber;
	}

	public void setOfficeTelephoneNumber(String officeTelephoneNumber) {
		this.officeTelephoneNumber = officeTelephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public CivilStatus getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(CivilStatus civilStatus) {
		this.civilStatus = civilStatus;
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

	public ResidenceCertificate getResidenceCertificate() {
		return residenceCertificate;
	}

	public void setResidenceCertificate(
			ResidenceCertificate residenceCertificate) {
		this.residenceCertificate = residenceCertificate;
	}

	public IndividualBuyerSpouse getSpouse() {
		return spouse;
	}

	public void setSpouse(IndividualBuyerSpouse spouse) {
		this.spouse = spouse;
	}

	@Override
	public String toString() {
		return "IndividualBuyer [id=" + id + ", clientId=" + clientId
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mailingAddress=" + mailingAddress + ", occupation="
				+ occupation + ", employerName=" + employerName
				+ ", employerAddress=" + employerAddress + ", telephoneNumber="
				+ telephoneNumber + ", mobileNumber=" + mobileNumber
				+ ", officeTelephoneNumber=" + officeTelephoneNumber
				+ ", emailAddress=" + emailAddress + ", birthDate=" + birthDate
				+ ", civilStatus=" + civilStatus + ", citizenship="
				+ citizenship + ", religion=" + religion + ", tinNumber="
				+ tinNumber + ", residenceCertificate=" + residenceCertificate
				+ ", spouse=" + spouse + "]";
	}

}
