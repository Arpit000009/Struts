<#import "layout/layout.ftl" as layout>
<@layout.layout>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>

<h2>Products(this is ftl)</h2>



<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Description</th>
<th>Price</th>
</tr>

<@s.iterator value="products">

<tr>
<td><@s.property value="id"/></td>
<td><@s.property value="name"/></td>
<td><@s.property value="description"/></td>
<td><@s.property value="price"/></td>
</tr>

</@s.iterator>

</table>

</body>
</html>

</@layout.layout>