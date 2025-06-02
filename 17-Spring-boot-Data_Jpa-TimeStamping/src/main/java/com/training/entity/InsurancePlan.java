package com.training.entity;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="INSURANE_PLANS")
public class InsurancePlan {

	@Id
	@GeneratedValue
	private Integer planId;

	private String planName;

	private String planStatus;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(updatable = false)
	private LocalDate updatedDate;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}


	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", planName=" + planName + ", planStatus=" + planStatus
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
	

}
