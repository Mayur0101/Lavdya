<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="hidden" name="sid" value="${stu.sid}")"><br>
Enter Student Name :- <input type="text" name="sname" value="${stu.sname}"><br>
Enter Username :- <input type="text" name="username" value="${stu.username}"><br>
Enter Password :- <input type="text" name="password" value="${stu.password}"><br>
<input type="submit" value="Submit">
</form>
</body>
</html>