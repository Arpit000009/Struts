<%@ taglib prefix="s" uri="/struts-tags" %>

<h2>Add Employee</h2>

<s:form action="saveEmployee">

<s:fielderror/>

<s:textfield name="name" label="Name"/>

<s:textfield name="department" label="Department"/>

<s:textfield name="salary" label="Salary"/>

<s:submit value="Save Employee"/>

</s:form>