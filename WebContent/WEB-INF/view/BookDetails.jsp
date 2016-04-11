<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Details</title>
</head>
<body>
<center>
<br><br><br><br><br><br>
<div style="color: teal;font-size: 30px">Book Details</div>
<br><br>
<c:if test="${!empty book}">
<table border="1" bgcolor="black" width="600px">
<tr style="background-color: teal;color: white;text-align: center;" height="40px">
<td>Book Id</td>
<td>Book Name</td>
<td>Author Name</td>
</tr>
<c:forEach items="${book}" var="book">
<tr style="background-color:white;color: black;text-align: center;" height="30px" >
<td><c:out value="${book.book_id}"/></td>
<td><c:out value="${book.book_name}"/></td>
<td><c:out value="${book.author}"/></td>
</tr>
</c:forEach>
</table>
</c:if>
<br>
<a href="registerBook.html" >Click Here to add new Book</a>
</center>
</body>
</html>