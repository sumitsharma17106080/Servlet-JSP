<!DOCTYPE html>
<%@page import="java.util.Random"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PAGE 4</title>
<style type="text/css">
.Class1 {
	width: 50%;
	border: 2px solid;
	margin: auto;
}
</style>
</head>
<body>
	<%
	Random r=new Random();
	int num=r.nextInt(150);
	System.out.println();
	if(num<=10) response.sendRedirect("https://mywipro.wipro.com");
	
	else if(num>10 && num<100) response.sendRedirect("https://www.google.com");
	
	else response.sendRedirect("error.jsp");
	%>
</body>
</html>