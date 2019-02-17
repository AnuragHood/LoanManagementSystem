<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.anurag.beans.Customer"%>
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
</style>

<%
	ArrayList<Customer> customerList = (ArrayList<Customer>) request.getAttribute("customerList");
%>
<title>Searching Customer</title>
</head>
<body bgcolor="#e9e9e9">
	<table align="center" border="1" width="80%">
		<tr>
			<th>CustomerId</th>
			<th>CustomerType</th>
			<th>Occupation</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Age</th>
			<th>Address</th>
			<th>Action</th>

		</tr>
		<%
			for (Customer customer : customerList) {
		%>
		<tr>
			<td><%=customer.getCustomerId()%></td>
			<td><%=customer.getCustomerType()%></td>
			<td><%=customer.getOccupation()%></td>
			<td><%=customer.getName()%></td>
			<td><%=customer.getGender()%></td>
			<td><%=customer.getAge()%></td>
			<td><%=customer.getAddress()%></td>
			<td align="center"><a
				href="CustomerController?action=Delete&customerNo=<%=customer.getCustomerId()%>">Delete</a><br>
				<a
				href="CustomerController?action=update&customerNo=<%=customer.getCustomerId()%>">Edit</a>
				</td>


		</tr>
		<%
			}
		%>
		</tr>

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