<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Update Book</title>
</head>

<body>

<h2>Update Book</h2>

<s:form action="updateBook">

<s:hidden name="book.id"/>

<s:textfield name="book.title" label="Title"/>

<s:textfield name="book.author" label="Author"/>

<s:textfield name="book.price" label="Price"/>

<s:submit value="Update Book"/>

</s:form>

</body>
</html>