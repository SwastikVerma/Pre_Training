package com.HelloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class App extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/*
		 * Use print writer
		 */
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.print("Hello World");
	}
}
