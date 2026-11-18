<%@page import="ex3.dto.MyorderDTO"%>
<%@page import="ex3.dao.MyorderDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id = "v" class ="ex3.dto.MyorderDTO"/>
    <jsp:setProperty property="*" name="v"/>
<%
if(request.getMethod().equalsIgnoreCase("POST")){
// 	String name = request.getParameter("name");
// 	int age = Integer.parseInt(request.getParameter("age")); 
// 	String order = request.getParameter("order");
	
	System.out.println("name: " + v.getName());
	System.out.println("age: " + v.getAge());
	System.out.println("order: " + v.getOrder());
	out.println("POST");
	
	//MyorderDTO v = new MyorderDTO(); 
// 	v.setName(name);
// 	v.setAge(age);
// 	v.setOrder(order);
	
	MyorderDao.getDao().addOrder(v);
	System.out.println("post 완료");
}else{
	out.println("GET");
}
%>