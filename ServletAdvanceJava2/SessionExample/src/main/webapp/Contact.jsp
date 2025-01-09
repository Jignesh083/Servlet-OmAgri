<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="save-contact" method="post">
	<input placeholder="Enter Name" type="text" name="name">
	<br>
	<br>
	<br>
	
	<input placeholder="Enter Number" type="tel" name="mobile">
	<br>
	<br>
	<br>
	
	<input type="submit" value="Save Contact">
	<br><br>
	<a href="show-contact">Show Contacts</a>
	</form>
</body>
</html>