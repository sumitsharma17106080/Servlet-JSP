<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Operation</title>
</head>
<body>
<%! int a=20;int b=10; String str="Sumit"; %>

<% int div=a/b; %>

<h1>Divsion =<%=  div %></h1>
<h1>String Length =<%=  str.length() %></h1>
</body>
</html>
