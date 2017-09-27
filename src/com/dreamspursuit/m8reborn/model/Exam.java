package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

public class Exam {
	private ArrayList<Task> listOfTasks;
	private double grade;
	
	public Exam() {
		listOfTasks = new ArrayList<Task>();
	}

	public ArrayList<Task> getListOfTasks() {
		return listOfTasks;
	}

	public void setListOfTasks(ArrayList<Task> listOfTasks) {
		this.listOfTasks = listOfTasks;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
