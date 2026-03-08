<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Add Book</title>

<style>

body{
    margin:0;
    padding:0;
    font-family: Arial, Helvetica, sans-serif;
    background: linear-gradient(135deg,#667eea,#764ba2);
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
    color:#333;
}

.form-group{
    margin-bottom:15px;
}

input[type=text]{
    width:100%;
    padding:10px;
    border-radius:6px;
    border:1px solid #ccc;
    font-size:14px;
}

input[type=text]:focus{
    outline:none;
    border-color:#667eea;
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
    transition:0.3s;
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

.back:hover{
    text-decoration:underline;
}

.error{
    color:red;
    margin-bottom:10px;
    text-align:center;
}

</style>

</head>

<body>

<div class="container">

<h2> Add Book</h2>

<div class="error">
<s:fielderror/>
</div>

<s:form action="addBook">

<div class="form-group">
<s:textfield name="book.title" label="Title"/>
</div>

<div class="form-group">
<s:textfield name="book.author" label="Author"/>
</div>

<div class="form-group">
<s:textfield name="book.price" label="Price"/>
</div>

<s:submit value="Add Book" cssClass="button"/>

</s:form>

<a href="dashboard" class="back"> Back to Dashboard</a>

</div>

</body>
</html>