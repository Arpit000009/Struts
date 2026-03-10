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
	<h2>Withdraw Money</h2>

<s:form action="withdraw">

<s:textfield name="amount" label="Amount"/>

<s:submit value="Withdraw"/>

</s:form>
</body>
</html>