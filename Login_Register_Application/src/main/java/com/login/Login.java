package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// Data from Form
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();

		try {
			// Connecting MySql Database
			Class.forName("com.mysql.cj.jdbc.Driver");

			// update Your username and password of MySql
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root",
					"password");

			// Query:
			PreparedStatement pStatement = connection
					.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
			pStatement.setString(1, username);
			pStatement.setString(2, password);

			// Executing the query:
			ResultSet result = pStatement.executeQuery();

			// check if result is null or has an object
			if (result.next()) {

				// Using HttpSession to store username
				HttpSession session = request.getSession();
				session.setAttribute("session_username", result.getString("username"));

				// To redirect to Profile Page
				RequestDispatcher rDispatcher = request.getRequestDispatcher("/Profile.jsp");
				rDispatcher.include(request, response);
			} else {
				// if result is null this would be executed
				response.setContentType("text/html");
				out.print("<h1>Incorrect Password or Username</h1>");
				RequestDispatcher rDispatcher = request.getRequestDispatcher("/LoginForm.jsp");
				rDispatcher.include(request, response);
			}

		} catch (Exception e) {
			out.print("<h1>Incorrect " + e.getMessage() + "</h1>");
		}
	}

}
