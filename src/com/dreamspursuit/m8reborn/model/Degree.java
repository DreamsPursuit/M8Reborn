package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

public class Degree {
	private ArrayList<Teacher> listOfTeachers;
	private Teacher coordinator;
	private ArrayList<UC> listOfUCs;
	
	public Degree(Teacher coordinator) {
		this.coordinator = coordinator;
		listOfTeachers = new ArrayList<Teacher>();
		listOfUCs = new ArrayList<UC>();
	}

	public ArrayList<Teacher> getListOfTeachers() {
		return listOfTeachers;
	}

	public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
		this.listOfTeachers = listOfTeachers;
	}

	public Teacher getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(Teacher coordinator) {
		this.coordinator = coordinator;
	}
	
	public ArrayList<UC> getListOfUCs() {
		return listOfUCs;
	}

	public void setListOfUCs(ArrayList<UC> listOfUCs) {
		this.listOfUCs = listOfUCs;
	}
	
}
