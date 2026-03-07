<#assign s=JspTaglibs["/struts-tags"]>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>

<body>

<h1>Login Page</h1>

<@s.form action="login1" method="post">

    <@s.textfield name="username" label="Username"/>
    <br><br>

    <@s.password name="password" label="Password"/>
    <br><br>

    <@s.submit value="Login"/>

</@s.form>

</body>
</html>