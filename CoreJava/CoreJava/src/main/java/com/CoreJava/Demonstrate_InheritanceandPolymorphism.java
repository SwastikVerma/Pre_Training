package com.CoreJava;

import com.CoreJava.PolymorphismAndInheritance.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demonstrate_InheritanceandPolymorphism {
	private static final Logger logger = LogManager.getLogger(Demonstrate_InheritanceandPolymorphism.class);
	
	public static void main(String[] args) {
		// Polymorphism:
				logger.info("Demonstration of Polymorphism:");
				// singlelevel
				BaseClass singleInheritance = new DerivedClass1();
				singleInheritance.display(); // Base class method
				singleInheritance.display("Single Inheritance Test"); // Overloaded Base class method
				singleInheritance.show(); // Overridden DerivedClass1 method

				// multilevel
				BaseClass multilevelInheritance = new DerivedClass2();
				multilevelInheritance.display("Multilevel Inheritance Test");

				// hierarchical
				BaseClass hierarchicalInheritance = new Hierarchical();
				hierarchicalInheritance.display("Hierarchical Inheritance Test");

				// hybrid
				Hybrid hybridInheritance = new Hybrid();
				hybridInheritance.display("Hybrid Inheritance Test");

				BaseInterface hybridAsInterface = new Hybrid();
				hybridAsInterface.display(); // Method from BaseInterface implemented in Hybrid class
	}
}
