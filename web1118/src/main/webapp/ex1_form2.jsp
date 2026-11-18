<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "ex2_pro.jsp" method = "post">
<p>
이름: <input type:"text" name="name">
</p>
<p>
나이:
<select name="age">
<option value="10">10</option>
<option value="20">20</option>
<option value="30">30</option>
</select>
</p>
<p>
주문: 
<select name = "order">
<option value="된장찌개">된장찌개</option>
<option value="비빔밥">비빔밥</option>
<option value="돈가스">돈가스</option>
</select>
</p>
<p>
<input type ="submit" value ="전송">
</p>
</form>
</body>
</html>