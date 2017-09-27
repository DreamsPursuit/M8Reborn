package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Degree> listOfDegrees;
	private Teacher coordinator;
	
	public Department(Teacher coordinator, String name) {
		listOfDegrees = new ArrayList<Degree>();
		this.coordinator = coordinator;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Degree> getListOfDegrees() {
		return listOfDegrees;
	}

	public void setListOfDegrees(ArrayList<Degree> listOfDegrees) {
		this.listOfDegrees = listOfDegrees;
	}

	public Teacher getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(Teacher coordinator) {
		this.coordinator = coordinator;
	}
	
	
}
