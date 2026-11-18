<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!private int num;

	public String test(int num) {
		this.num = num;
		if (num > 10) {
			return "<p style=\"color:red\">10보다 많아요</p>";
		} else {
			return "<p style=\"color:blue\">10보다 적어요</p>";
		}
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1</title>
</head>
<body>
<%
System.out.println(test(19));
%>
<%=test(19) %>
</body>
</html>