<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Search Book</title>

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
width:500px;
text-align:center;
}

h2{
margin-bottom:20px;
color:#333;
}

button{
padding:10px 20px;
background:#667eea;
border:none;
color:white;
border-radius:5px;
cursor:pointer;
}

button:hover{
background:#5a67d8;
}

table{
width:100%;
margin-top:20px;
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
}

.back{
display:block;
margin-top:20px;
text-decoration:none;
color:#667eea;
}

</style>
</head>

<body>

<div class="container">

<h2>Search Book</h2>

<s:form action="searchBook">

<s:textfield name="title" label="Enter Book Title"/>

<s:submit value="Search"/>

</s:form>

<s:if test="books != null">

<table>

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

<a href="dashboard" class="back">Back to Dashboard</a>

</div>

</body>
</html>