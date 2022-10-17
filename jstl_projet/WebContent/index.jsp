<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Example</title>
</head>
<body>

<c:forEach begin="1" step="1" end="10" var="idx">
	<c:out value="${idx}"></c:out>
</c:forEach>

<c:set var="name" value="Ramesh"/>

<c:out value="${name}"/>

<c:set var="mark" value="80"/>

<c:if test="${mark>60}">
<c:out value="Grade A"></c:out>
</c:if>


</body>
</html>