package com.dreamspursuit.m8reborn.model;

import org.joda.time.DateTime;

public class User {
	private String uName;
	private String fName;
	private String lName;
	private String address;
	private String phone;
	private String homePhone;
	private DateTime dob;
	
	public User(String uName, String fName, String lName, String address, String phone, String homePhone,DateTime dob) {
		this.uName = uName;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.phone = phone;
		this.homePhone = homePhone;
		this.dob = dob;
	}

	public User(String uName, String fName, String lName, DateTime dob) {
		this.uName = uName;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getuName() {
		return uName;
	}

	public DateTime getDob() {
		return dob;
	}
	
}
