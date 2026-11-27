<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--views/header.jsp--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>header.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.custom-green {
	background-color: #81c784;
	color: white;
}
</style>
</head>
<body>

	<header class="custom-green  text-white">
		<div class="container">
			<%-- 네이게이션 영역 시작 --%>
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="container-fluid">
					<a class="navbar-brand" href="main">메인 화면</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
						aria-controls="navbarNavDropdown" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarNavDropdown">
						<ul class="navbar-nav">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="main">Home</a></li>
							<li class="nav-item"><a class="nav-link" href="fboardList">FreeBoard</a>
							</li>
							<li class="nav-item"><a class="nav-link" href="upList">FileUpload</a>
							</li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#"
								id="navbarDropdownMenuLink" role="button"
								data-bs-toggle="dropdown" aria-expanded="false"> Dropdown
									link </a>
								<ul class="dropdown-menu"
									aria-labelledby="navbarDropdownMenuLink">
									<li><a class="dropdown-item" href="#">Action</a></li>
									<li><a class="dropdown-item" href="#">Another action</a></li>
									<li><a class="dropdown-item" href="#">Something else
											here</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</nav>

		</div>
		<%-- 네이게이션 영역 끝--%>
	</header>