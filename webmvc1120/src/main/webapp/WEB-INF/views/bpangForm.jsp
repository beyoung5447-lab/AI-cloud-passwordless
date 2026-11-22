<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 목록</title>
<style>
#Wrap {
	width: 900px;
	margin: 50px auto;
}

.product-menu {
	display: flex;
	gap: 20px;
	padding: 0;
	list-style: none;
}

.product-menu li {
	width: 200px;
	text-align: center;
	border-radius: 10px;
	padding: 15px;
	cursor: pointer;
	transition: 0.3s;
}

.product-menu li:hover {
	background-color: #f5f5f5;
	transform: translateY(-5px);
}

.product-menu a {
	text-decoration: none;
	color: inherit;
	display: block;
}

.product-menu img {
	width: 100%;
	height: 150px;
	object-fit: contain;
}

.product-menu p {
	font-size: 16px;
	font-weight: bold;
	color: #333;
}
</style>
</head>
<body>
	<div id="Wrap">
		<ul class="product-menu">
			<li>
				<a href="main.ict?cmd=bpang">
					<img src="images/menu1.png" alt="붕어빵">
					<p>붕어빵</p>
				</a>
			</li>
			<li>
				<a href="main.ict?cmd=pizza">
					<img src="images/menu2.png" alt="피자">
					<p>피자</p>
				</a>
			</li>
			<li>
				<a href="main.ict?cmd=goguma">
					<img src="images/menu3.png" alt="고구마">
					<p>고구마</p>
				</a>
			</li>
		</ul>
	</div>
</body>
</html>