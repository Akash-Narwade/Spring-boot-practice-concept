package com.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANK_ACCOUNTS")
@IdClass(AccountPK.class)
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BAL")
	private Double minBal;

	@Id
	private Integer accId;

	@Id
	private String accType;

	@Id
	private String holderName;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accId=" + accId + ", accType=" + accType
				+ ", holderName=" + holderName + "]";
	}

}
