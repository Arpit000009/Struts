<#macro layout>

<html>

<head>

<title>Application</title>
</head>

<body>

<#include "header.ftl">

<div style = "display:flex">

<#include "sidebar.ftl">

<div style="padding:20px">

<#nested>

</div>
</div>


<#include "footer.ftl">

</body>

</html>

</#macro>