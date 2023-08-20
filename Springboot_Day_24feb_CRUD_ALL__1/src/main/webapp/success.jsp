
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

 function deleteBikebooking(){
	 
	 alert("call delete");
	 document.myfrom.action="delete";
	 document.myfrom.submit();
 }
 function edit(){
	 
	 alert("call edit");
	 document.myfrom.action="edit";
	 document.myfrom.submit();
 }

</script>
</head>
<body>
<form name="myfrom">
<table border="1">
<tr>
<th>S_id</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>ADDRESS</th>
<th>ACTION</th>
</tr>
<c:forEach items="${data}" var="b">
<tr>
<td><input type="radio" name="sid" value="${b.sid}"></td>
<td>${b.username}</td>
<td>${b.password}</td>
<td>${b.addr}</td>

<td><a href="delete?bid=${b.sid}">DELETE</a>||<a href="edit?bid=${b.sid}">Edit</a></td>
</tr>
</c:forEach>
</table>
<button onclick="deleteBikebooking()">DELETE</button>||<button onclick="edit()">EDIT</button>
</form>
</body>
</html>