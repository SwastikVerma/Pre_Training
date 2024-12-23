<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>Sample Registration Page</title>
<link rel="stylesheet" href="style.css">
<script src="script.js"></script>
<body>
	<div class="box">
		<h1>Register Here</h1>
		<form name="registrationForm" onsubmit="return validateForm()"
			method="post" action="registerationForm">
			<p>Email</p>
			<input type="email" name="Email" placeholder="Email Address" required>
			<p>Username</p>
			<input type="text" id="username" name="username"
				placeholder="Username" required>
			<p>Password</p>
			<input type="password" name="password" placeholder="Password"
				required> <input type="submit" value="Submit"> <a
				href="LoginForm.jsp">Have an account?</a>
		</form>
	</div>
</body>
</head>
</html>