<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<form name="f">
<table border="2" align="center">
<tr>
<th>eID</th>
<th>ename</th>
<th>UserName</th>
<th>Password</th>
<th>Operation</th>
</tr>

<c:forEach items="${list}" var="e">
<tr>
<td>${e.eid}</td>
<td>${e.ename}</td>
<td>${e.uname}</td>
<td>${e.pass}</td>
<td><a href="delete?eid=${e.eid}">DELETE</a>||<a href="edit?eid=${e.eid}">EDIT</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>