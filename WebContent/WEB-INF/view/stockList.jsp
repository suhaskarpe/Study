<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stock Details</title>
</head>
<body>
	<center>
		<div style="color: teal; font-size: 30px">Stock Details</div>
		<c:if test="${!empty stockList}">
			<table border="1" bgcolor="black" width="600px">
				<tr style="background-color: teal; color: white; text-align: center;" height="40px">
					<td>Stock Name</td>
					<td>Stock Code</td>
					<td>Stock ID</td>
				</tr>
				<c:forEach items="${stockList}" var="stock">
					<tr style="background-color: white; color: black; text-align: center;" height="30px">
						<td><c:out value="${stock.stockName}" /></td>
						<td><c:out value="${stock.stockCode}" /></td>
						<td><c:out value="${stock.stockId}" /></td>
						<td><a href="edit?id=${stock.stockId}">Edit</a></td>
						<td><a href="delete?id=${stock.stockId}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<c:if test="${empty stockList}">
		<h3>No Stock data</h3>
		</c:if>
		<a href="addStock">Click Here to add new Stock</a>
	</center>
</body>
</html>