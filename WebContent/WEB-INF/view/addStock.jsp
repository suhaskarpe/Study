<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stock Registration Form</title>
</head>
<body>
	<center>
		<div style="color: teal; font-size: 30px">Stock Registration Form</div>
		<c:url var="userRegistration" value="addStock.html" />
		<form:form id="registerForm" modelAttribute="stock" method="post" action="registerStock">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="stockName">Stock Name</form:label></td>
					<td><form:input path="stockName" /></td>
				</tr>
				<tr>
					<td><form:label path="stockCode">Stock Code</form:label></td>
					<td><form:input path="stockCode" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" />
					</td>
				</tr>
			</table>
		</form:form>
		<a href="stockList.html">Click Here to see Stock List</a>
	</center>
</body>
</html>