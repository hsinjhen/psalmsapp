package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class SellerType implements Serializable {
	private Long id;
	private String type;
	private BigDecimal distributionRate;

	public SellerType() {
		super();
	}

	public SellerType(String type, BigDecimal distributionRate) {
		super();
		this.type = type;
		this.distributionRate = distributionRate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getDistributionRate() {
		return distributionRate;
	}

	public void setDistributionRate(BigDecimal distributionRate) {
		this.distributionRate = distributionRate;
	}

	@Override
	public String toString() {
		return "SellerType [id=" + id + ", type=" + type
				+ ", distributionRate=" + distributionRate + "]";
	}

}
