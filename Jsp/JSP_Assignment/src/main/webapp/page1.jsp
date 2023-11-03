<!DOCTYPE html>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PAGE 1</title>
<style type="text/css">
.Class1{
width: 50%;
border: 2px solid;
margin: auto;
}
</style>
</head>
<body>
<div class="Class1">
<h1> Today Time :<%= LocalTime.now() %> and Date : <%= LocalDate.now() %></h1>
</div>
</body>
</html>