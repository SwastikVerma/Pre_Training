package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerationForm")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// Data from Form
		String email = request.getParameter("Email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();

		try {
			// Connecting MySql Database
			Class.forName("com.mysql.cj.jdbc.Driver");

			// update Your username and password of MySql
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root",
					"password");

			// Writing the query:
			PreparedStatement pStatement = connection.prepareStatement("insert into users values(?,?,?)");
			pStatement.setString(1, email);
			pStatement.setString(2, username);
			pStatement.setString(3, password);

			// if executed successfully count will be > 1
			int count = pStatement.executeUpdate();

			if (count > 0) {
				// if user registers Successfully:
				response.setContentType("text/html");
				out.print("<h1>User Registered Succesfully</h1>");
				RequestDispatcher rDispatcher = request.getRequestDispatcher("/RegistrationForm.jsp");
				rDispatcher.include(request, response);
			} else {
				response.setContentType("text/html");
				out.print("<h1>An error occured. Please register again</h1>");
				RequestDispatcher rDispatcher = request.getRequestDispatcher("/RegistrationForm.jsp");
				rDispatcher.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setContentType("text/html");
			out.print("<h1>An error occured" + e.getMessage() + "</h1>");
			RequestDispatcher rDispatcher = request.getRequestDispatcher("/RegistrationForm.jsp");
			rDispatcher.include(request, response);
		}
	}
}
