<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h1>배열/Collection 타입 EL 표기법</h1>
	<h2>req.setAttribute("SingerList",singerList)EL 표기법</h2>
	<ul>
		<li>${singerList[0]}</li>
		<li>${singerList[1]}</li>
	</ul>
	<h2>고객 정보</h2>
	<ol>
		<li>이름:${customerList[0].name}</li>
		<li>이메일:${customerList[0].email}</li>
		<li>전화:${customerList[0].phone}</li>
		<hr>
		<li>이름:${customerList[1].name}</li>
		<li>이메일:${customerList[1].email}</li>
		<li>전화:${customerList[1].phone}</li>


	</ol>

</body>
</html>