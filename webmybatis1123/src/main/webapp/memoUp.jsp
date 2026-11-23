<%@page import="dao.MemoDao"%>
<%@page import="org.apache.commons.beanutils.BeanUtils"%>
<%@page import="dto.MemoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemoDTO vo = new MemoDTO();
BeanUtils.populate(vo,request.getParameterMap());
System.out.println("=========================");
System.out.println("Num"+vo.getNum());
System.out.println("Title"+vo.getMtitle());
System.out.println("content"+vo.getMcontent());
System.out.println("writer"+vo.getMwriter());
MemoDao.getDao().update(vo);
response.sendRedirect("memoListTest.jsp");
%>