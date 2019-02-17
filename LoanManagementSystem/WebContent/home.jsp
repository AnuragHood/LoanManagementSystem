<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	color: blue;
	text-align: center;
	font-family: Arial;
	
}

* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #e9e9e9;
}

.topnav a {
	float: left;
	display: block;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #2196F3;
	color: white;
}

.topnav .search-container {
	float: right;
}

.topnav input[type=text] {
	padding: 6px;
	margin-top: 8px;
	font-size: 17px;
	border: none;
}

.topnav .search-container button {
	float: right;
	padding: 6px 10px;
	margin-top: 8px;
	margin-right: 16px;
	background: #ddd;
	font-size: 17px;
	border: none;
	cursor: pointer;
}

.topnav .search-container button:hover {
	background: #ccc;
}

@media screen and (max-width: 600px) {
	.topnav .search-container {
		float: none;
	}
	.topnav a, .topnav input[type=text], .topnav .search-container button {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
	}
	.topnav input[type=text] {
		border: 1px solid #ccc;
	}
}
</style>


<title>Customer Management System</title>
</head>
<body bgcolor="#e9e9e9">
	<div class="topnav">
		<a class="active" href="home.jsp">Home</a> <a href="aboutme.jsp">About</a>
		<a href="aboutme.jsp">Contact</a>
		<div class="search-container">
			<form action="CustomerController?action=home" method="post">
				<input type="text" placeholder="SearchByName or Id" name="search" required>
				<button type="submit">
					<image src="search.jpeg" alt="searching" height="20">
				</button>
			</form>
		</div>

		<center>
			<img src="download.png" alt="Logo" width="75" height="160">
			<h1>Customer Management System</h1>
			<p>
				<a href="CustomerController?action=list">CustomerList and Delete
					Customer</a><br> <a href="AddCustomer.jsp">Add a new Customer</a><br>
				 <a
					href="CustomerController?action=list">Update Customer Details</a>
			</p>
		</center>

		<footer class="footer"> &copy;contact inforormation ::
		+917905384377 copyright@2018 Anurag Pathak<a href="aboutme.jsp" font
			color="blue">About Developer</a> </footer>

	</div>
</body>
</html>
