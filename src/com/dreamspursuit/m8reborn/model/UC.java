package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

public class UC {
	private ArrayList<Project> listOfProjects;
	private ArrayList<Exam> listOfExams;
	private ArrayList<Student> listOfStudents;
	
	public UC() {
		listOfProjects = new ArrayList<Project>();
		listOfExams = new ArrayList<Exam>();
		listOfStudents = new ArrayList<Student>();
	}

	public ArrayList<Project> getListOfProjects() {
		return listOfProjects;
	}

	public void setListOfProjects(ArrayList<Project> listOfProjects) {
		this.listOfProjects = listOfProjects;
	}

	public ArrayList<Exam> getListOfExams() {
		return listOfExams;
	}

	public void setListOfExams(ArrayList<Exam> listOfExams) {
		this.listOfExams = listOfExams;
	}

	public ArrayList<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(ArrayList<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	
	
}
