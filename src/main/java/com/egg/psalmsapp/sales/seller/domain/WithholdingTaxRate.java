package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class WithholdingTaxRate implements Serializable {
	private Long id;
	private String type;
	private BigDecimal rate;

	public WithholdingTaxRate() {
		super();

	}

	public WithholdingTaxRate(String type, BigDecimal rate) {
		super();
		this.type = type;
		this.rate = rate;
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

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WithholdingTaxRate [id=" + id + ", type=" + type + ", rate="
				+ rate + "]";
	}

}
