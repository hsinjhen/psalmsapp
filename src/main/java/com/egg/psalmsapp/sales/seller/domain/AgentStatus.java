package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AgentStatus implements Serializable {
	private Long id;
	private String status;

	public AgentStatus() {
		super();
	}

	public AgentStatus(String status) {
		super();
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AgentStatus [id=" + id + ", status=" + status + "]";
	}

}
