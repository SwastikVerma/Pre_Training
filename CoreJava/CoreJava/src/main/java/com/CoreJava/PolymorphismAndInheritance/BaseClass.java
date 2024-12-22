package com.CoreJava.PolymorphismAndInheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
	public Logger logger = LogManager.getLogger(BaseClass.class);

	// Compile-time Polymorphism (Method Overloading)
	public void display() {
		logger.info("Base Class display method!!!");
	}

	public void display(String message) {
		logger.info("Base Class display with message:{} ", message);
	}

	public void show() {
		logger.info("Show method of Base Class!!!");
	}
}
