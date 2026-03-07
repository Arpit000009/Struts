<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Product</h2>

<s:form action="addProduct">

<s:textfield name="name" label="Product Name"/>

<s:textfield name="description" label="Description"/>

<s:textfield name="price" label="Price"/>

<s:submit value="Add Product"/>

</s:form>
</body>
</html>