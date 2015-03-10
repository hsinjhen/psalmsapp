package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("serial")
public class IndividualSeller implements Serializable {
	private Long id;
	private String agentId;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date birthDate;
	private String address;
	private String tinNumber;
	private Date contractDuration;
	private ContractType contractType;
	private VatStatus vatStatus;
	private SellerCategory sellerCategory;
	private AgentStatus agentStatus;
	private SalesGroup salesGroup;
	private SellerType sellerType;
	private WithholdingTaxRate withholdingTaxRate;
	private BigDecimal operatingFund;

	public IndividualSeller() {
		super();
	}

	public IndividualSeller(String agentId, String firstName, String lastName,
			String middleName, Date birthDate, String address,
			String tinNumber, Date contractDuration, ContractType contractType,
			VatStatus vatStatus, SellerCategory sellerCategory,
			AgentStatus agentStatus, SalesGroup salesGroup,
			SellerType sellerType, WithholdingTaxRate withholdingTaxRate,
			BigDecimal operatingFund) {
		super();
		this.agentId = agentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.address = address;
		this.tinNumber = tinNumber;
		this.contractDuration = contractDuration;
		this.contractType = contractType;
		this.vatStatus = vatStatus;
		this.sellerCategory = sellerCategory;
		this.agentStatus = agentStatus;
		this.salesGroup = salesGroup;
		this.sellerType = sellerType;
		this.withholdingTaxRate = withholdingTaxRate;
		this.operatingFund = operatingFund;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public Date getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(Date contractDuration) {
		this.contractDuration = contractDuration;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public VatStatus getVatStatus() {
		return vatStatus;
	}

	public void setVatStatus(VatStatus vatStatus) {
		this.vatStatus = vatStatus;
	}

	public SellerCategory getSellerCategory() {
		return sellerCategory;
	}

	public void setSellerCategory(SellerCategory sellerCategory) {
		this.sellerCategory = sellerCategory;
	}

	public AgentStatus getAgentStatus() {
		return agentStatus;
	}

	public void setAgentStatus(AgentStatus agentStatus) {
		this.agentStatus = agentStatus;
	}

	public SalesGroup getSalesGroup() {
		return salesGroup;
	}

	public void setSalesGroup(SalesGroup salesGroup) {
		this.salesGroup = salesGroup;
	}

	public SellerType getSellerType() {
		return sellerType;
	}

	public void setSellerType(SellerType sellerType) {
		this.sellerType = sellerType;
	}

	public WithholdingTaxRate getWithholdingTaxRate() {
		return withholdingTaxRate;
	}

	public void setWithholdingTaxRate(WithholdingTaxRate withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
	}

	public BigDecimal getOperatingFund() {
		return operatingFund;
	}

	public void setOperatingFund(BigDecimal operatingFund) {
		this.operatingFund = operatingFund;
	}

	@Override
	public String toString() {
		return "IndividualSeller [id=" + id + ", agentId=" + agentId
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", birthDate=" + birthDate
				+ ", address=" + address + ", tinNumber=" + tinNumber
				+ ", contractDuration=" + contractDuration + ", contractType="
				+ contractType + ", vatStatus=" + vatStatus
				+ ", sellerCategory=" + sellerCategory + ", agentStatus="
				+ agentStatus + ", salesGroup=" + salesGroup + ", sellerType="
				+ sellerType + ", withholdingTaxRate=" + withholdingTaxRate
				+ ", operatingFund=" + operatingFund + "]";
	}

}
