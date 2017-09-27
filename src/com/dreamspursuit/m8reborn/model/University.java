package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

public class University extends Institution {
	private ArrayList<Department> listOfDeparts;

	public University(String name, String headquarters, String areaServed, String industry, String logoPath) {
		super(name, headquarters, areaServed, industry, logoPath);
		listOfDeparts = new ArrayList<Department>();
	}

	public ArrayList<Department> getListOfDeparts() {
		return listOfDeparts;
	}

	public void setListOfDeparts(ArrayList<Department> listOfDeparts) {
		this.listOfDeparts = listOfDeparts;
	}
	
	public Department searchDepartment(String departName) {
		for(Department  each: listOfDeparts) {
			if(each.getName().equals(departName)) {
				return each;
			}
		}
		
		return null;
	}	

}
