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
<ul>
<li>번호: <%=v.getNum() %></li>
<li>작성자: <%=v.getMwriter() %></li>
<li>내용: <%=v.getMcontent() %></li>
<li>작성날짜: <%=v.getMdate() %></li>
</ul>
<a href="memoDel.jsp?num=<%=num %>">삭제</a>
<a href="memoUpdate.jsp?num=<%=num %>">수정</a>
</body>
</html>