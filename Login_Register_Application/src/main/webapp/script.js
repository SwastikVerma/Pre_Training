/**
 * 
 */

function validateLogin(event) {

	// Get form values
	const username = document.getElementsByName("username")[0].value;
	const password = document.getElementsByName("password")[0].value;

	// Username validation
	if (username.trim() === "") {
		alert("Please enter your username");
		return false;
	}

	// Password validation
	if (password.trim() === "") {
		alert("Please enter your password");
		return false;
	}

	return true;

}


function validateForm(event) {

	// Get values
	const email = document.forms["registrationForm"]["Email"].value;
	const username = document.forms["registrationForm"]["username"].value;
	const password = document.forms["registrationForm"]["password"].value;

	// Email validation
	const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
	if (!emailPattern.test(email)) {
		alert("Please enter a valid email address");
		return false;
	}

	// Username validation
	if (username.length < 5) {
		alert("Username must be of at least 5 characters");
		return false;
	}

	// Password validation
	const passwordPattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
	if (!passwordPattern.test(password)) {
		alert("Password must contain at least 8 characters, including one uppercase letter, one lowercase letter, and one number");
		return false;
	}

	return true;
}
