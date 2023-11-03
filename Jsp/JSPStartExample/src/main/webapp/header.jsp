<%@page import="java.util.Random,java.time.LocalDateTime" %>
<html>
<head>
<title>Header</title>
<style>
.Class1{
background: blue;
color: white;
padding: 20px;

}
</style>

</head>
<body >
<div class="Class1">
<h1> This is Header</h1>
<% Random r=new Random();
	int rd=r.nextInt(11);
	
	LocalDateTime ldt=LocalDateTime.now();

%>
<h2> Below Entry Come form Imported Classs We are Using @page import Tag In This Header.jsp</h2>
<h2>This is your Random Number <%=rd %></h2>
<h2> Date- Time => <%= ldt %></h2>
</div>
</body>
</html>
