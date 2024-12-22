package com.CoreJava.Basic_Implementation;

public class StudentDetails extends PersonDetails implements Comparable<StudentDetails> {
	private int marks;

	public StudentDetails(int id, int marks, String name, int age) {
		// constructor
		super(name, age, id);
		this.marks = marks;
	}

	// getter:

	public int getMarks() {
		// input - none
		// output - Returns an Integer value, Student Marks
		return marks;
	}

	// setters:
	public void setMarks(int marks) {
		this.marks = marks;
	}

	// implementation of abstract method:
	// method to display Student Details
	@Override
	public void displayDetails() {
		logger.info("Student Detail ID: {} , Name:{} , Age:{} , Marks:{}", getId(), getName(), getAge(), marks);
	}

	@Override
	public int compareTo(StudentDetails student) {
		return Integer.compare(student.getMarks(), this.marks);
	}

}
