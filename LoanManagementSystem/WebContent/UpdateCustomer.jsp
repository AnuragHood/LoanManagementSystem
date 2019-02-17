<%@page import="com.anurag.beans.Customer"%>
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
}

input[type=text] {
	width: 80%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
}

button {
	font-family: 'Freight Sans Bold', Helvetica, Arial,
		sans-serif !important;
	font-weight: bold !important;
	letter-spacing: normal;
	text-rendering: optimizelegibility;
	background-color: green;
}
</style>
<title>Adding new Customer</title>
</head>
<% 
Customer cust= (Customer) request.getAttribute("customer");
%>
<body bgcolor="silver">
	<center>
		<form action="CustomerController" method="post">
			<input type="number" name="customerNo" placeholder="ENTER CUSTOMERID" value="<%=cust.getCustomerId()%>" readonly><br>
			<input type="text" name="customerType" placeholder="ENTER CUSTOMERTYPE" value="<%=cust.getCustomerType()%>"><br> 
			<input type="text" name="customerOccupation" placeholder="ENTER OCCUPATION" value="<%=cust.getOccupation()%>"><br>
			<input type="text" name="customerName" placeholder="ENTER NAME" value="<%=cust.getName()%>"><br>
			<input type="text" name="customerGender" placeholder="ENTER GENDER" value="<%=cust.getGender()%>"><br>
			<input type="number" name="customerAge" placeholder="ENTER AGE" value="<%=cust.getAge()%>"><br>
			<input type="text" name="customerAddress" placeholder="ENTER ADDRESS" value="<%=cust.getAddress()%>"><br>
			<button class="button" type="submit" name="action" value="UpdateFinal"
				colspan="1">Update Customer</button>
			<button class="button" type="reset" value="Reset" colspan="3">Reset</button>

		</form>
	</center>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


	<p align="center">
		<a href="home.jsp">Home</a>
		<footer class="footer"> &copy;contact inforormation ::
		+917905384377 <br>
		copyright@2018 Anurag Pathak |<a href="aboutme.jsp">about
			developer</a> </footer>
	</p>
</body>
</html>