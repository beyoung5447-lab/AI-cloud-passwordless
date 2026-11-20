<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String num1Param = request.getParameter("num1");
String num2Param = request.getParameter("num2");

int range = (num1Param != null && !num1Param.isEmpty()) ? Integer.parseInt(num1Param) : 4;
int dan = (num2Param != null && !num2Param.isEmpty()) ? Integer.parseInt(num2Param) : 5;

// a 단 입력 시 a-2 단부터 a+2 단까지 출력
int startdan = dan - 2;
int enddan = dan + 2;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 (<%=startdan%>단 ~ <%=enddan%>단)</title>
<style>
table {
	width: 900px;
	border-collapse: collapse;
}

td {
	border: 1px solid #999;
	text-align: center;
	padding: 6px;
}
</style>
</head>
<body>
	<h3>기준 단: <%=dan%>단 (<%=startdan%>단 ~ <%=enddan%>단 출력)</h3>
	<table>
		<%
		for (int i = 1; i <= 9; i++) {
		%>
		<tr>
			<%
			for (int j = startdan; j <= enddan; j++) {
			%>
			<td><%=j%> x <%=i%> = <%=j * i%></td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>