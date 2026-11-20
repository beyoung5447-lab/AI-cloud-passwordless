<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4_lambda</title>
<style>
#Wrap{ width:300px;margin:auto; } 
ul {list-style:none;}
} </style>
</head>
<body>
	<div id="Wrap">
		<h1>ex4_lambda</h1>
		<ul>
		<%
		List<String> reList = (List<String>) request.getAttribute("names2");
		for (String e : reList) {
		%>
		<li><%=e%></li>
		<%
		}
		%>
		</ul>
	</div>

</body>
</html>