<%@page import="org.apache.jasper.compiler.Node.GetProperty"%>
<%@page import="org.apache.commons.beanutils.BeanUtils"%>
<%@page import="dto.MemoDTO"%>
<%@page import="dao.MemoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemoDTO v = new MemoDTO();
//v.setMtitle("테스형");
//v.setMwriter("메모맨");
//v.setMcontent("나의 메모 내용");
BeanUtils.populate(v, request.getParameterMap());
MemoDao.getDao().addMemo(v);
response.sendRedirect("memoListTest.jsp");
%>
