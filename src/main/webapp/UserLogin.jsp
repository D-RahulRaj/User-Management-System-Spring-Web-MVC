<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<style type="text/css">
	input {
		width:40vh;
		padding: 10px;
		margin: 8px;
	}
	input:last-of-type {
		width: 20vh;
		background-color: black;
		color: white;
	}
	
</style>
<body>
	<center><h2 style="background-color: red; color: white;">User Login</h2>
	<form action="Login">
		<input placeholder="Enter User EmailId" name = "Email"> 
		<br>
		<input placeholder="Enter User Password" name = "Password">
		<br>
		<input type="Submit" value="Login">
		
		<% String lmsg = (String) request.getAttribute("exceptionMsg"); 
		if(lmsg!=null) {
	%>
	<h3  style= "color: red;"><%= lmsg %></h3>
	<%} %>
</center>


</body>
</html>