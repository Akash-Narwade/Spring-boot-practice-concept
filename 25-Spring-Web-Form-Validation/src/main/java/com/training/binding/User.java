package com.training.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {

	@NotEmpty(message="Please Enter User Name")
	private String uname;
	
	@NotEmpty(message="Please Enter password")
	private String pwd;
	
	@NotEmpty(message="Please Enter Email")
	@Email(message="Please Enter Valid Email")
	private String email;
	
	@NotNull(message="Please Enter Phone")
	private String phno;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + ", phno=" + phno + "]";
	}

}
