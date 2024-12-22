package com.CoreJava.Basic_Implementation;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentDetails>{
	@Override
	public int compare(StudentDetails s1,StudentDetails s2) {
		return Integer.compare(s1.getAge(), s2.getAge());
	}
}
