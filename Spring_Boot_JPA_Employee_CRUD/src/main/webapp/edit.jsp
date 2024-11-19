<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
<form action="editdata">
Id: <input type="number" name="id" value="${data.id}"><br> 
Username: <input type="text" name="uname" value="${data.uname}"><br>
Password: <input type="password" name="pass" value="${data.pass}"><br>
Name: <input type="text" name="name" value="${data.name}"><br>
<input type="submit" value="edit">
</form>
</body>
</html>