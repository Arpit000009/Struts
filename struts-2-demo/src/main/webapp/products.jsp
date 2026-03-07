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
	<h2>Products</h2>
<s:debug/>
<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Description</th>
<th>Price</th>
</tr>

<s:iterator value="products">

<tr>
<td><s:property value="id"/></td>
<td><s:property value="name"/></td>
<td><s:property value="description"/></td>
<td><s:property value="price"/></td>
</tr>

</s:iterator>

</table>
</body>
</html>