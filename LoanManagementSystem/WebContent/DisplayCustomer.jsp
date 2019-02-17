<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.anurag.beans.Customer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<title>Display Customers</title>
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
			for (Customer c : customerList) {
		%>
		<tr>
			<td><%=c.getCustomerId()%></td>
			<td><%=c.getCustomerType()%></td>
			<td><%=c.getOccupation()%></td>
			<td><%=c.getName()%>
			<td><%=c.getGender()%></td>
			<td><%=c.getAge()%>
			<td><%=c.getAddress()%></td>
			<td align="center"><a
				href="CustomerController?action=Delete&customerNo=<%=c.getCustomerId()%>">Delete</a><br>
				<a href="CustomerController?action=update&customerNo=<%=c.getCustomerId()%>">Edit</a>
				</td>
		</tr>
		<%
			}
		%>

	</table>
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