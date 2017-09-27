package com.dreamspursuit.m8reborn.model;

import org.joda.time.DateTime;

public class Start {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		
		System.out.println(dt.toString("dd/MM/YYYY HH:mm:ss"));

	}

}
