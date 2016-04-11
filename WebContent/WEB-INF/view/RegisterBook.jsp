<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
<center>
<br><br><br><br><br><br>
<div style="color: teal;font-size: 30px">Registration Form</div>
<br><br>
<c:url var="bookRegistration" value="saveBook.html"/>
<form:form id="registerForm" modelAttribute="book" method="post" action="${bookRegistration}">
<table width="400px" height="150px">
<tr>
<td><form:label path="book_name">Book Name</form:label></td>
<td><form:input  path="book_name"/></td>
</tr>
<tr>
<td><form:label path="author">Author Name</form:label></td>
<td><form:input  path="author"/></td>
</tr>
<tr><td></td><td>
<input type="submit" value="RegisterBook" />
</td></tr>
</table>
</form:form>
<br>
<a href="bookList.html" >Click Here to see Book List</a>
</center>
</body>
</html>