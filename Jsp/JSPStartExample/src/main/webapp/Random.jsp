<%@page import="java.util.Random"%>
<html>
<head>
<title>Random</title>
</head>
<body>

<%
Random r=new Random();
int num=r.nextInt(55);
System.out.println(num);
if(num<=10) response.sendRedirect("page1.jsp");
else if(num>10 && num<=20) response.sendRedirect("page2.jsp");
else if(num>20 && num<=30) response.sendRedirect("page3.jsp");
else if(num>30 && num<=40) response.sendRedirect("https://www.google.com");
else if(num>40 && num<=50) response.sendRedirect("https://mywipro.wipro.com/Home");
else if(num>50 && num<=60) response.sendRedirect("https://www.youtube.com/");
else if(num>50) response.sendRedirect("error.jsp");

%>
</body>
</html>