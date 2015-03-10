package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SellerCategory implements Serializable {
	private Long id;
	private String category;

	public SellerCategory() {
		super();
	}

	public SellerCategory(String category) {
		super();
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SellerCategory [id=" + id + ", category=" + category + "]";
	}

}
