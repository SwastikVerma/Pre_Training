<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<link rel="stylesheet" href="style.css">
<script src="script.js"></script>
<title>Login Page</title>
<body>
	<div class="box">
		<h1>Login Here</h1>
		<form name="loginForm" onsubmit="return validateLogin(event)"
			action="loginForm" method="post">
			<p>Username</p>
			<input type="text" name="username" placeholder="Enter Username"
				required>
			<p>Password</p>
			<input type="Password" name="password" placeholder="Enter Password"
				required> <input type="submit" value="Submit"><br>
			<a href="RegistrationForm.jsp">Don't have account?</a>
		</form>
	</div>
</body>
</head>

</html>