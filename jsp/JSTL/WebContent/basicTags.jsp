
<%@page import="java.util.*" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<head>
	<style type="text/css">
	
	
	
	</style>
</head>

<c:set var="salary" scope="session" value="${2*5000}"/>

	<c:if test="${salary>50000}">
		<c:out value="${salary}"></c:out>
		
	</c:if>
	
	<c:set var="a" value="345"/>
	<c:set var="b" value="200"/>
	<c:set var="c" value="234"/>
	
	
	<c:choose>
	
		<c:when test="${a>b&&a>c }">
			<div><h2><c:out value="a is big and value is ${a}"/></h2></div>
		</c:when>
		
		<c:when test="${b>c }">
			<c:out value="${b}"/>
		</c:when>
	
		
		<c:otherwise>
			<c:out value="${c}"></c:out>
		</c:otherwise>
	
	
	</c:choose>
	
	<c:choose>
	
		<c:when test="${a>b}">
			<div><h2><c:out value="a is big and value is ${a}"/></h2></div>
		</c:when>
		
		<c:otherwise>
			<c:out value="b is big and value is ${b}"></c:out>
		</c:otherwise>
	
	
	</c:choose>
	
	
	<%
	
	
		int numbers[] = {10,20,30,40,50,60};
	request.setAttribute("numbers", numbers);
	
	
	%>
	
	<c:forEach begin="1" end="10" var="x">
		
		<c:out value="${x}"/>
	</c:forEach>
	
	
	
	<c:forEach items="${numbers}"  var="num">
		<c:out value="${num}"/>
	</c:forEach>
	
	
	
	<%
	
		List<String> list = new ArrayList<String>();
	list.add("One");
	list.add("two");
	list.add("three");
	list.add("four");
	
	request.setAttribute("data", list);
	
	%>
	
	
	<c:forEach items="${data}" var="numString">
		<c:out value="${numString}"/>
	
	</c:forEach>
	
	
	
	
	
	
	
	
