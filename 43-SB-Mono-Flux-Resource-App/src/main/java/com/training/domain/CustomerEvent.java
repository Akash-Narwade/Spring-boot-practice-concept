package com.training.domain;

import java.util.Date;

public class CustomerEvent {

	public String customerName;

	private Date date;

	public CustomerEvent(String customerName, Date date) {
		super();
		this.customerName = customerName;
		this.date = date;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
 
	@Override
	public String toString() {
		return "CustomerEvent [customerName=" + customerName + ", date=" + date + "]";
	}

}
