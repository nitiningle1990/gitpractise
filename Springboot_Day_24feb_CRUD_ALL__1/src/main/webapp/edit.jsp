<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit form Page</title>
</head>
<body>
<form action="siso">
<pre>
<input type="hidden" name="sid" value="${b.sid}">
UserName       :<input type="text" name="username" value="${b.username}">
Password       :<input type="text" name="password" value="${b.password}">
Address        :<input type="text" name="addr" value="${b.addr}">

<input type="submit" value="UPDATE">
</pre>
</form>
</body>
</html>