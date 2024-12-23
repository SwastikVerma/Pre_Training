package com.CoreJava.Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demonstrate_IOException {
	private static final Logger logger = LogManager.getLogger(Demonstrate_IOException.class);
	public Demonstrate_IOException() {
		File file = new File("nonexistentfile.txt");
		FileReader fileReader = null;

		try {
			// Try to open file 
			fileReader = new FileReader(file);
			
		} catch (IOException e) {
			logger.error("Exception Caught: {}", e.getMessage());
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				logger.error("Exception Caught: {}", e.getMessage());
			}
		}
	}
}
