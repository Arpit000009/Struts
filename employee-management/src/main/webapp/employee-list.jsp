<%@ taglib prefix="s" uri="/struts-tags" %>
<h2>Employee List</h2>
<table border="1">
<tr>
 <th>ID</th>
 <th>Name</th>
 <th>Department</th>
</tr>
<s:iterator value="employees">
<tr>
 <td><s:property value="id"/></td>
 <td><s:property value="name"/></td>
 <td><s:property value="department"/></td>
</tr>
</s:iterator>


</table>

<br>

<a href="addEmployee.jsp">
<button>Add Employee</button>
</a>