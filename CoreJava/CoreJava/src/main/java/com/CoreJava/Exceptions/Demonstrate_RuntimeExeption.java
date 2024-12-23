package com.CoreJava.Exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demonstrate_RuntimeExeption {

	private static final Logger logger = LogManager.getLogger(Demonstrate_RuntimeExeption.class);

	/*
	 * Runtime Exception is the parent of IllegalArgumentException
	 * IndexOutOfBoundsException Arithematic Exception
	 */
	public Demonstrate_RuntimeExeption() {

		// For Arithematic Exception
		logger.info("Demonstrating Arithematic Exception");
		int a = 5;
		int b = 0;
		
		try {
			int res = a / b;
		} catch (ArithmeticException e) {
			logger.error("Exception Caught: {}", e.getMessage());
		}
		

		logger.info("Demonstrating Index out of bounds Exception");
		int[] arr = new int[2];
		
		try {
			arr[2] = 5;
		}
		catch (IndexOutOfBoundsException e) {
			logger.error("Exception Caught: {}", e.getMessage());
		}
	}
}
