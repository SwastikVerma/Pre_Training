package com.CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.CoreJava.Basic_Implementation.*;

public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {

		List<StudentDetails> ListofStudents = addStudentDetails();
		List<FacultyDetails> ListofFaculties = addFacultyDetails();

		displayAll(ListofFaculties);
		displayAll(ListofStudents);
		displayById(ListofFaculties, 3);
		displayById(ListofStudents, 5);
		displayById(ListofStudents, 24);

		// Sorting:

		// using Comparator in StudentDetails class:
		// Sort on basis of Student marks in descending order
		Collections.sort(ListofStudents);
		logger.info("Sorted Student List on basis of Marks:");
		displayAll(ListofStudents);

		// using Comparable :
		// Sorts on basis of Student Age in Ascending order
		logger.info("Sorted Student List on basis of Age:");
		Collections.sort(ListofStudents, new AgeComparator());
		displayAll(ListofStudents);

	}

	// A generic method to display All Student or Faculty Details present in the
	// list
	private static <E extends GenericIdentifiable> void displayAll(List<E> list) {
		for (E item : list) {
			item.displayDetails();
		}
	}

	// A Generic method to return Student or Faculty Details by ID
	private static <E extends GenericIdentifiable> void displayById(List<E> list, int findId) {
		E resultbyID = null;
		for (E item : list) {
			if (item.getId() == findId) {
				resultbyID = item;
				break;
			}
		}
		if (resultbyID == null) {
			logger.error("No Details By ID:{}", findId);
		} else {
			resultbyID.displayDetails();
		}
	}

	// method to add 20 random Student Details
	// Returns an ArrayList
	private static List<StudentDetails> addStudentDetails() {
		// Random Values
		int[] studentId = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] studentMarks = { 85, 90, 78, 88, 92, 76, 81, 84, 89, 95, 87, 79, 83, 91, 77, 80, 86, 93, 82, 75 };
		String[] studentName = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack",
				"Kara", "Leo", "Mia", "Nina", "Oscar", "Paul", "Quinn", "Rita", "Steve", "Tina" };
		int[] studentAge = { 18, 19, 20, 21, 22, 18, 19, 20, 21, 22, 18, 19, 20, 21, 22, 18, 19, 20, 21, 22 };

		int n = studentId.length;
		// List of Student Details objects
		List<StudentDetails> ListofStudents = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			// Creating new object and appending it in list
			ListofStudents.add(new StudentDetails(studentId[i], studentMarks[i], studentName[i], studentAge[i]));
		}
		return ListofStudents;
	}

	// method to add 20 random Faculty Details
	// Returns an ArrayList
	private static List<FacultyDetails> addFacultyDetails() {
		// Random Values
		int[] facultyId = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		String[] facultyName = { "Prof. Adams", "Prof. Baker", "Prof. Clark", "Prof. Davis", "Prof. Evans",
				"Prof. Foster", "Prof. Green", "Prof. Hill", "Prof. Irving", "Prof. Johnson", "Prof. Kelly",
				"Prof. Lewis", "Prof. Martin", "Prof. Nelson", "Prof. Owens", "Prof. Parker", "Prof. Quinn",
				"Prof. Reid", "Prof. Scott", "Prof. Taylor" };
		int[] facultyAge = { 40, 42, 44, 45, 38, 37, 39, 41, 43, 46, 35, 36, 34, 48, 47, 49, 50, 52, 53, 51 };
		String[] facultyDepartment = { "CSE", "ECE", "IT", "ME", "CE", "CSE", "ECE", "IT", "ME", "CE", "CSE", "ECE",
				"IT", "ME", "CE", "CSE", "ECE", "IT", "ME", "CE" };
		int[] facultySalary = { 75000, 80000, 82000, 87000, 90000, 78000, 83000, 85000, 88000, 92000, 76000, 81000,
				84000, 86000, 89000, 77000, 79000, 91000, 94000, 95000 };
		int n = facultyId.length;

		// List of Faculty Details objects
		List<FacultyDetails> ListofFacultyDetails = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			// Creating new object and appending it in list
			ListofFacultyDetails.add(new FacultyDetails(facultyId[i], facultyName[i], facultyAge[i],
					facultyDepartment[i], facultySalary[i]));

		}

		return ListofFacultyDetails;

	}
}
