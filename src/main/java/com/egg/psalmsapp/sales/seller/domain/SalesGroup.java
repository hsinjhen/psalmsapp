package com.egg.psalmsapp.sales.seller.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.egg.psalmsapp.inventory.project.domain.Project;

@SuppressWarnings("serial")
public class SalesGroup implements Serializable {
	private Long id;
	private String name;
	private Integer level;
	private Project mainProject;
	private Date mainProjectDuration;
	private BigDecimal groupCommissionRate;

	public SalesGroup() {
		super();
	}

	public SalesGroup(String name, Integer level, Project mainProject,
			Date mainProjectDuration, BigDecimal groupCommissionRate) {
		super();
		this.name = name;
		this.level = level;
		this.mainProject = mainProject;
		this.mainProjectDuration = mainProjectDuration;
		this.groupCommissionRate = groupCommissionRate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Project getMainProject() {
		return mainProject;
	}

	public void setMainProject(Project mainProject) {
		this.mainProject = mainProject;
	}

	public Date getMainProjectDuration() {
		return mainProjectDuration;
	}

	public void setMainProjectDuration(Date mainProjectDuration) {
		this.mainProjectDuration = mainProjectDuration;
	}

	public BigDecimal getGroupCommissionRate() {
		return groupCommissionRate;
	}

	public void setGroupCommissionRate(BigDecimal groupCommissionRate) {
		this.groupCommissionRate = groupCommissionRate;
	}

	@Override
	public String toString() {
		return "SalesGroup [id=" + id + ", name=" + name + ", level=" + level
				+ ", mainProject=" + mainProject + ", mainProjectDuration="
				+ mainProjectDuration + ", groupCommissionRate="
				+ groupCommissionRate + "]";
	}

}
