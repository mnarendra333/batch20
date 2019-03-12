<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>




<form:form action="validate" modelAttribute="login">

	username : <form:input path="uname"/><br>
	password : <form:password path="pwd"/><br>
	<form:button value="login" name="login">login</form:button>



</form:form>