<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Add Book</title>
</head>

<body>

<h2>Add Book</h2>

<s:fielderror cssStyle="color:red"/>

<s:form action="addBook">

<s:textfield name="book.title" label="Title"/>

<s:textfield name="book.author" label="Author"/>

<s:textfield name="book.price" label="Price"/>

<s:submit value="Add Book"/>

</s:form>

<br>

<a href="dashboard">Back to Dashboard</a>

</body>
</html>