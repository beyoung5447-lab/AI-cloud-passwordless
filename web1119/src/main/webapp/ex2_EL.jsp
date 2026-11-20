<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2_EL</title>
</head>
<body>
    <h1 style="margin: auto">EL예제 1</h1>
    <div style="width: 300px; margin: auto">
        <ul>
            <%-- ${attr.key --%>
            <li>Name : ${car.name}</li>
            <li>Maker : ${car.maker}</li>
        </ul>
    </div>
</body>
</html>