package com.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GENDERS")
public class Genders {
	@Id
	@Column(name="GENDER_ID")
	private Integer genderId;
	
	@Column(name="GENDER_NAME")
	private String genderName;

	public Integer getGenderID() {
		return genderId;
	}

	public void setGenderID(Integer genderID) {
		this.genderId = genderID;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
}
