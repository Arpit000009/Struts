<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>View Books</title>

<style>

body{
margin:0;
padding:0;
font-family:Arial;
background:linear-gradient(135deg,#667eea,#764ba2);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.container{
background:white;
padding:40px;
border-radius:10px;
box-shadow:0 10px 25px rgba(0,0,0,0.2);
width:700px;
}

h2{
text-align:center;
margin-bottom:25px;
}

table{
width:100%;
border-collapse:collapse;
}

table th{
background:#667eea;
color:white;
padding:10px;
}

table td{
padding:10px;
border-bottom:1px solid #ddd;
text-align:center;
}

.action{
text-decoration:none;
color:#667eea;
font-weight:bold;
}

.action:hover{
text-decoration:underline;
}

.back{
display:block;
text-align:center;
margin-top:20px;
text-decoration:none;
color:#667eea;
}

</style>

</head>

<body>

<div class="container">

<h2>Book List</h2>

<table>

<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Price</th>
<th>Update</th>
<th>Delete</th>
</tr>

<s:iterator value="books">

<tr>

<td><s:property value="id"/></td>
<td><s:property value="title"/></td>
<td><s:property value="author"/></td>
<td><s:property value="price"/></td>

<td>
<a class="action" href="editBook?id=<s:property value='id'/>">Update</a>
</td>

<td>
<a class="action" href="deleteBook?id=<s:property value='id'/>">Delete</a>
</td>

</tr>

</s:iterator>

</table>

<a href="dashboard" class="back">Back to Dashboard</a>

</div>

</body>
</html>