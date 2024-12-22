package com.CoreJava.Basic_Implementation;

public class FacultyDetails extends PersonDetails {

	private String department;
	private int salary;

	// constructor
	public FacultyDetails(int id, String name, int age, String department, int salary) {
		super(name, age, id);
		this.department = department;
		this.salary = salary;
	}

	// getters:

	public String getDepartment() {
		// input-none
		// Returns a string ,department of faculty
		return department;
	}

	public int getSalary() {
		// input - none
		// Returns an Integer, Salary of Faculty
		return salary;
	}

	// setters:
	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// implementation of abstract method:
	// method to display Faculty Details
	@Override
	public void displayDetails() {
		logger.info("Faculty Detail ID: {} , Name:{} , Age:{} , Department:{} , Salary:{}", getId(), getName(),
				getAge(), department, salary);

	}
}
