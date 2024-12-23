package com.CoreJava.UniversityExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class PersonDetails implements GenericIdentifiable {
	private String name;
	int age;
	private int id;
	public Logger logger = LogManager.getLogger(PersonDetails.class);

	protected PersonDetails(String name, int age, int id) {
		// Constructor
		this.name = name;
		this.age = age;
		this.id = id;

	}

	// getters:
	public int getId() {
		// input- none
		// output- Returns an Integer value, Student id
		return id;
	}

	public String getName() {
		// input - None
		// output - Returns a string, Name of the person
		return name;
	}

	public int getAge() {
		// input - None
		// output - Returns an Integer, age of the person
		return age;
	}

	@Override
	public abstract void displayDetails();
}