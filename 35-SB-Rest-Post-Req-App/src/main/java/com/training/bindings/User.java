package com.training.bindings;

@jakarta.xml.bind.annotation.XmlRootElement
public class User {

	private Integer uid;
	private String fname;
	private String lname;
	private String email;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(Integer uid, String fname, String lname, String email) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public User() {
		System.out.println("User Constructor");
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	

}
