package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContractType implements Serializable {
	private Long id;
	private String type;

	public ContractType() {
		super();
	}

	public ContractType(String type) {
		super();
		this.type = type;
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

	@Override
	public String toString() {
		return "ContractType [id=" + id + ", type=" + type + "]";
	}

}
