<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Random,java.util.ArrayList" %>
<%@taglib prefix="p" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
<h1>You are Welcome First JSP</h1>
<!--Declaration/Declartive  Tag for JAva-->

<p:out value="${5*5} "></p:out>

<%! 
	int a=1;int b=6;
	public int dotenTimes(int a){
		return a*10;
	}
	public int doSum(){
		return a+b;
	}
%>


<%
	out.println("<br>");
	out.println(a);
	out.println("<br>");
	out.println(dotenTimes(5));
%>
<!-- Expression Tag  -->
<h1> Sum is <%= doSum()%></h1>
<%@include file="header.jsp" %>

<h1> Random number less 11 :- <% Random r=new Random();
	int n=r.nextInt(11);%><%= n %></h1>
</body>
</html>