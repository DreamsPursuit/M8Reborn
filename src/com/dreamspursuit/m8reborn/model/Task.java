package com.dreamspursuit.m8reborn.model;

import org.joda.time.DateTime;

public class Task {
	private DateTime deadline;
	private DateTime start;
	private String name;
	private String description;
	private int priority; //goes from 1 to 3;
	
	public Task(DateTime deadline, String name, int priority) {
		this.deadline = deadline;
		this.name = name;
		this.priority = priority;
		start = new DateTime();
	}

	public DateTime getStart() {
		return start;
	}

	public DateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(DateTime deadline) {
		this.deadline = deadline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
