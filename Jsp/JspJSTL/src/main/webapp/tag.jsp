<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tag2</title>
</head>
<body>
<c:set var="i" value="23" scope="application"></c:set>
<h1><c:out value="${i}"></c:out></h1>
<c:if test="${i==23 }"><h1> Yes i is 23</h1></c:if>
<c:forEach var ="j" begin="1" end="10" step="2">
<h1> Value of j <c:out value="${j }"></c:out></h1>
</c:forEach>
<c:url var="myurl" value="https://www.google.com/search">
<c:param name="q"> What is India</c:param>
</c:url>
<c:out value="${myurl }"></c:out>

<c:redirect url="${myurl }"></c:redirect>
<fn:
</body>
</html>