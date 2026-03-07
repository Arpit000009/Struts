<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Search Book</title>
</head>

<body>

<h2>Search Book</h2>

<s:form action="searchBook">

<s:textfield name="title" label="Enter Book Title"/>

<s:submit value="Search"/>

</s:form>

<br>

<s:if test="books != null">

<table border="1">

<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Price</th>
</tr>

<s:iterator value="books">

<tr>

<td><s:property value="id"/></td>

<td><s:property value="title"/></td>

<td><s:property value="author"/></td>

<td><s:property value="price"/></td>

</tr>

</s:iterator>

</table>

</s:if>

<br>

<a href="dashboard">Back to Dashboard</a>

</body>
</html>