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
<h2>This is i value application Test</h2>
<c:out value="${i}"></c:out>
<c:choose>
<c:when test="${i>0 }"> <h1>  Number is positive</h1></c:when>
<c:when test="${i<0 }"> <h1>  Number is negative</h1></c:when>
<c:otherwise> <h1>  Number is Zero</h1></c:otherwise>
</c:choose>
</body>
</html>