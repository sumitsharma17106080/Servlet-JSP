<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tag3</title>
</head>
<body>
<h1>Welcome to Tag3 </h1>
<c:set var="str" value="Sumit Sharma"></c:set>
<h1><c:out value="${str }"></c:out></h1>
<%-- <c:out value="${fn:length(str)}"></c:out>
<c:out value="${fn:toLowerCase(str) }"></c:out> --%>
</body>
</html>