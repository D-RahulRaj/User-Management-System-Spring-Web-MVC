<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<style>
	input {
		width:40vh;
		padding: 10px;
		margin: 8px;
	}
	input:last-of-type {
		width: 20vh;
		background-color: black;
		color: white;
		margin-bottom: 25px;
	}
	
	input:first-of-type {
		margin-top: 25px;
	}
	
	form {
		border: thin;
		border-style: solid;
		border-width: 2px;
		border-radius: 25px;
		border-left-width: 100px;
		border-right-width: 100px;
		margin-top: 10px;
	}
}
</style>
</head>
<body>

<!-- The data which is sent as a request is in the form of URL 
	> URL's of two types
	  1) QueryString 
	  2) Pathparam
	
	> QueryString :- 
	  -----------
	  * If it is QueryString the data which is sent as request should be sent through the URL by storing with in the keys
	  * The keys  should be created after to the API or Endpoit ending with '?' 
	  * If it is more than one value, First value shouls be ended with '&' operator 
	  * Syntax : localhost :8080/registration?Key=Values&Key=Value 	  	
-->
	<center><h1 style="background-color: lightGreen;">User Registration</h1>
	<form action="Registration">
		<input placeholder="Enter User Name" name = "userName">
		<br>
		<input placeholder="Enter User EmailId" name = "userEmail"> 
		<br>
		<input placeholder="Enter User Mobile Number" name = "MobileNumber">
		<br>
		<input placeholder="Enter User Password" name = "userPassword">
		<br>
		<input placeholder="Enter User Gender" name = "userGender">
		<br>
		<input placeholder="Enter User Address" name = "userAddress">
		<br>
		<input type = "Submit" value="Register">
	</form>
	
	<% String msg = (String) request.getAttribute("exceptionMsg"); 
		if(msg!=null) {
	%>
	<h3  style= "color: red;"><%= msg %></h3>
	<%} %>
	</center>
	
</body>
</html>