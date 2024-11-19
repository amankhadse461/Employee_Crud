<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function editdata() {
	document.fn.action="edit";
	document.fn.submit();
}

function deletedata() {
	document.fn.action="delete";
	document.fn.submit();
}
</script>
<meta charset="UTF-8">
<title>Sucess</title>
</head>
<body>
<form name="fn">
<table border="2px">
<tr>
<th>Sr No</th>
<th>ID</th>
<th>Username</th>
<th>Name</th>
</tr>
<c:forEach items="${data}" var="emp">
<tr>
<td><input type="radio" name="id" value="${emp.id}"></td>
<td>${emp.id}</td> 
<td>${emp.uname}</td>
<td>${emp.name}</td>
</tr>
</c:forEach>
</table>
<table>
<tr>
<td><input type="button" value="Edit" onclick="editdata()"></td>
<td><input type="button" value="Delete" onclick="deletedata()"></td>
</tr>
</table>
</form>
</body>
</html>