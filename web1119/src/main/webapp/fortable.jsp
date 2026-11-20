<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int num = Integer.parseInt(request.getParameter("num1"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>webapp</title>
<style>
table {
	width: 100%;
	border-collapse: collapse;
	border: 1px solid #000;
}

th, td {
	border: 1px solid #000;
	padding: 8px 12px;
	text-align: left;
}

th {
	background-color: #f4f4f4;
}
</style>

</head>
<body>
	<h1>table</h1>
	<table>
		<tr>
			<th>no</th>
			<th>title</th>
			<th>writer</th>
			<th>data</th>
		</tr>
		<%for(int i=0; i<num;i++){ %>
		<tr>
		<td><%=i%></td>
			<td>3</td>
			<td>공지사항 안내입니다.</td>
			<td>관리자</td>
			<td>2026-11-19</td>

		</tr>
		<%} %>
	</table>


</body>
</html>