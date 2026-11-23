<%@page import="dao.MemoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
int num= Integer.parseInt(request.getParameter("num"));
System.out.println("num:"+num);
MemoDao.getDao().delete(num);
%>삭제완료