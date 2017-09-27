package com.dreamspursuit.m8reborn.model;

import org.joda.time.DateTime;

public class Employee extends User{
	private double salary;
	

	public Employee(String uName, String fName, String lName, DateTime dob, double salary) {
		super(uName, fName, lName, dob);
		this.salary = salary;
	}
	
	public Employee(String uName, String fName, String lName, String address, String phone, String homePhone,DateTime dob, double salary) {
		super(uName, fName, lName, address, phone, homePhone, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
