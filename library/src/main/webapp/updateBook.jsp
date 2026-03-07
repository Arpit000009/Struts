<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Update Book</title>

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
width:400px;
}

h2{
text-align:center;
margin-bottom:25px;
}

button{
width:100%;
padding:12px;
border:none;
background:#667eea;
color:white;
font-size:16px;
border-radius:6px;
cursor:pointer;
}

button:hover{
background:#5a67d8;
}

.back{
display:block;
text-align:center;
margin-top:15px;
text-decoration:none;
color:#667eea;
}

</style>

</head>

<body>

<div class="container">

<h2>Update Book</h2>

<s:form action="updateBook">

<s:hidden name="book.id"/>

<s:textfield name="book.title" label="Title"/>

<s:textfield name="book.author" label="Author"/>

<s:textfield name="book.price" label="Price"/>

<s:submit value="Update Book"/>

</s:form>

<a href="dashboard" class="back">Back to Dashboard</a>

</div>

</body>
</html>