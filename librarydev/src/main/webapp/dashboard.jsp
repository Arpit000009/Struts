<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Library Dashboard</title>

<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, Helvetica, sans-serif;
	background: linear-gradient(135deg, #667eea, #764ba2);
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	background: white;
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
	text-align: center;
	width: 350px;
}

h1 {
	margin-bottom: 30px;
	color: #333;
}

a {
	display: block;
	text-decoration: none;
	padding: 12px;
	margin: 10px 0;
	background: #667eea;
	color: white;
	border-radius: 6px;
	font-size: 16px;
	transition: 0.3s;
}

a:hover {
	background: #5a67d8;
	transform: scale(1.05);
}
</style>

</head>

<body>

	<div class="container">

		<h1>📚 Library Dashboard</h1>

		<a href="addBookPage">Add New Book</a> <a href="viewBooks">View
			All Books</a> <a href="searchBook.jsp">Search Book</a>

	</div>

</body>

</html>