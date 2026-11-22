<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 200px;
	background-color: #f1f1f1;
}

li a {
	display: block;
	color: black;
	padding: 8px 16px;
	text-decoration: none;
}

/* Change the link and background color on hover */
li a:hover {
	background-color: #555555;
	color: white;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="main.ict?cmd=hello">Hello</a></li>
		<li><a href="main.ict?cmd=menu">ICT먹거리</a></li>
	</ul>

</body>
</html>