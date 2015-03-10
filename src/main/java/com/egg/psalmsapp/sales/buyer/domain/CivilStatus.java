package com.egg.psalmsapp.sales.buyer.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CivilStatus implements Serializable {
	private Long id;
	private String type;

	public CivilStatus() {
		super();
	}

	public CivilStatus(String type) {
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
		return "CivilStatus [id=" + id + ", type=" + type + "]";
	}

}
