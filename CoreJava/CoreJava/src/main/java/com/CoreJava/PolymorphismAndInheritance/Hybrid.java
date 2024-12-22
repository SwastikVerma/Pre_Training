package com.CoreJava.PolymorphismAndInheritance;

// Implements Hybrid Interface:
public class Hybrid extends DerivedClass1 implements BaseInterface {
	@Override
	public void show() {
		logger.info("Show method of Hybrid Class!!!");
	}
}
