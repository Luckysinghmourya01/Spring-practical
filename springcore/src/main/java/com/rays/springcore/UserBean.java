package com.rays.springcore;

public class UserBean {

	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public UserBean(String firstName, String lastName, String email, String mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public UserBean() {
		// TODO Auto-generated constructor stub
	}
}
