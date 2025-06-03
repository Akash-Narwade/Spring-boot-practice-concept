package com.training.response;

@jakarta.xml.bind.annotation.XmlRootElement
public class TicketResponse {
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String from;
	private String to;
	private String train;
	private String status;
	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public TicketResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketResponse(String name, String dob, String gender, String doj, String from, String to, String train,
			String status, Double price) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.doj = doj;
		this.from = from;
		this.to = to;
		this.train = train;
		this.status = status;
		this.price = price;
	}

}
