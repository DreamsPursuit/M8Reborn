package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

public class Project {
	private ArrayList<Task> listOfTasks;
	private String type;
	
	public Project(String type) {
		this.type = type;
		listOfTasks = new ArrayList<Task>();
	}

	public ArrayList<Task> getListOfTasks() {
		return listOfTasks;
	}

	public void setListOfTasks(ArrayList<Task> listOfTasks) {
		this.listOfTasks = listOfTasks;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
