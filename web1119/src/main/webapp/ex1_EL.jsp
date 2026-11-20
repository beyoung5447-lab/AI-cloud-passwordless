<%@page import="ex2.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex1_EL</title>
</head>
<body>
    <h1>EL 예제 1</h1>
    <%
    CustomerVO vo = (CustomerVO) request.getAttribute("customer");
    %>
    <div style="width: 300px; margin: auto">
        <ul>
            <li>Num : <%--=vo.getNum()--%>${customer.num}</li>
            <li>Name : <%--=Fvo.getName()--%>${customer.name}</li>
            <li>Email : <%--=vo.getEmail()--%>${customer.email}</li>
            <li>phone : <%--=vo.getPhone()--%>${customer.phone}</li>
            <li>Date : <%--=vo.getCdate()--%></li>
        </ul>
    </div>
</body>
</html>