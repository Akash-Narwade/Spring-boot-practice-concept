package com.training.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="CONTACTS_MASTER")
public class ContactsMasterEntity {
       
	@Id
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;


	public ContactsMasterEntity(Integer contactId, String contactName, Long contactNumber) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}


	public ContactsMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ContactsMasterEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="
				+ contactNumber + "]";
	}
	

	
}
