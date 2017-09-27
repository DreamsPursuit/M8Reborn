package com.dreamspursuit.m8reborn.model;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Institution {
	private String name; //institution name
	private DateTime dateFounded; // date founded
	private String locationFounded; // location founded
	private ArrayList<String> foundersList; // list of founders, can later be searched on database to check if user with that name is found
	private String headquarters; // headquarters location
	private String areaServed; //global area served (ex: Worldwide, Europe, North America, etc)
	private ArrayList<String> keyPeople; // list of key people, mainly chief officers, can later be searched on database to check if user with that name is found
	private int numberOfEmployees; // number of employees
	private Institution parent; //parent Institution, null if no institution is owner;
	private ArrayList<Institution> susbsidiaries; // list of subsidiaries, null if none;
	private ArrayList<String> links; // company links for social purposes
	private String industry; // industry served by the company
	private String logoPath; // path to the logo file;
	private ArrayList<Employee> listOfEmployees; // list of employees of the company;
	
	
	/**
	 * 
	 * @param name
	 * @param headquarters
	 * @param areaServed
	 * @param industry
	 * @param logoPath
	 * 
	 */
	public Institution(String name, String headquarters, String areaServed, String industry, String logoPath) {
		this.name = name;
		this.headquarters = headquarters;
		this.areaServed = areaServed;
		this.industry = industry;
		this.logoPath = logoPath;
	}


	
	/**
	 * 
	 * @return name of the institution
	 * 
	 */
	public String getName() {
		return name;
	}


	/**
	 * 
	 * @param name
	 * 
	 * Sets the name of the institution
	 *  
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * 
	 * @return date founded
	 * 
	 */
	public DateTime getDateFounded() {
		return dateFounded;
	}


	/**
	 * 
	 * @param dateFounded
	 * 
	 * Sets the foundation date
	 * 
	 */
	public void setDateFounded(DateTime dateFounded) {
		this.dateFounded = dateFounded;
	}

	
	/**
	 * 
	 * @return location founded
	 * 
	 */
	public String getLocationFounded() {
		return locationFounded;
	}

	/**
	 * 
	 * @param dateFounded
	 * 
	 * Sets the foundation location
	 * 
	 */
	public void setLocationFounded(String locationFounded) {
		this.locationFounded = locationFounded;
	}


	/**
	 * 
	 * @return list of founders
	 * 
	 */
	public ArrayList<String> getFoundersList() {
		return foundersList;
	}


	/**
	 * @param foundersList
	 * 
	 * Sets the founders list
	 */
	public void setFoundersList(ArrayList<String> foundersList) {
		this.foundersList = foundersList;
	}


	/**
	 * @return headquarters location
	 */
	public String getHeadquarters() {
		return headquarters;
	}


	/**
	 * @param headquarters
	 * 
	 * Sets the headquarters location
	 */
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}


	public String getAreaServed() {
		return areaServed;
	}


	public void setAreaServed(String areaServed) {
		this.areaServed = areaServed;
	}


	public ArrayList<String> getKeyPeople() {
		return keyPeople;
	}


	public void setKeyPeople(ArrayList<String> keyPeople) {
		this.keyPeople = keyPeople;
	}


	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	public Institution getParent() {
		return parent;
	}


	public void setParent(Institution parent) {
		this.parent = parent;
	}


	public ArrayList<Institution> getSusbsidiaries() {
		return susbsidiaries;
	}


	public void setSusbsidiaries(ArrayList<Institution> susbsidiaries) {
		this.susbsidiaries = susbsidiaries;
	}


	public ArrayList<String> getLinks() {
		return links;
	}


	public void setLinks(ArrayList<String> links) {
		this.links = links;
	}


	public String getIndustry() {
		return industry;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	public String getLogoPath() {
		return logoPath;
	}


	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}


	public ArrayList<Employee> getListOfEmployees() {
		return listOfEmployees;
	}


	public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}
	
}
