<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<form action="submit-form" method="post">
	Email: <input type="email" name="email" id="">
	<br><br>
	Password: <input type="password" name="password" id="">
	<br><br>
	<input type="submit" value="Login">
	</form>
	
	
	<a href="session">Click here</a>
	
	<br><br>
	
	<div>
	<form action="savemyname" method="post">
		<input type="text" name="myname" id="" placeholder="Enter name">
		<br>
		<input type="submit" value="save my name">
	</form>
	
	<br>
	<br>
	
	<a href="showmyname">Show My Name</a>
	
	</div>
	</div>
</body>
</html>