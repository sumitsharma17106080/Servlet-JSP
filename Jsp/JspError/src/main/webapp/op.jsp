<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_p.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation</title>
</head>
<body>

<h1>Operation</h1>
<% int n1=Integer.parseInt(request.getParameter("n1")); 
 int n2=Integer.parseInt(request.getParameter("n2")); 
 int div=n1/n2;
 %>
 
 <h2>Result :- <%= div %></h2>
</body>
</html>