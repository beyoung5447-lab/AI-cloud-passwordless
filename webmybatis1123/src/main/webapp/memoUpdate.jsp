<%@page import="dao.MemoDao"%>
<%@page import="dto.MemoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int  num = Integer.parseInt(request.getParameter("num"));
MemoDTO v = MemoDao.getDao().detail(num);
%>

<form method="post" action="memoUp.jsp">
<input type="hidden" name="num" value="<%=num %>">
제목:<input type="text" name="mtitle" value="<%=v.getMtitle() %>">
작성자:<input type="text" name="mwriter" value="<%=v.getMwriter() %>">
내용:<input type="text" name="mcontent" value="<%=v.getMcontent() %>">
<input type="submit" value="send">
 </form>
</body>
</html>