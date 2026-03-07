<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books</title>
</head>

<body>

	<h2>Book List</h2>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
			<th>Delete</th>
		</tr>
		
		<s:iterator value="books">

			<tr>

				<td><s:property value="id" /></td>
				<td><s:property value="title" /></td>
				<td><s:property value="author" /></td>
				<td><s:property value="price" /></td>

				<td><a href="editBook?id=<s:property value='id'/>">Update</a></td>

				<td><a href="deleteBook?id=<s:property value='id'/>">Delete</a>
				</td>

			</tr>

		</s:iterator>
	</table>

	<br>

	<a href="dashboard">Back to Dashboard</a>

</body>
</html>