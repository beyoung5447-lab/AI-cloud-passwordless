<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach var="customer" items="${customerList}" varStatus="status">
			<li>${status.count}. ${customer.name}</li>
		</c:forEach>
			
	</ul>
	<h2>
	
	</h2>
</body>
</html>