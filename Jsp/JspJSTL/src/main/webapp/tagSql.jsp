<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="s" uri="http://java.sun.com/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tag Sql</title>
</head>
<body>
<h1>Welcome to Sql Jsp</h1>
<s:setDataSource driver="com.mysql.jdbc.Driver" 
user="root" password="1994" url="jdbc:mysql://localhost:3306/servletregister" var="ds"/>
<s:query var="rs" dataSource="${ds }"> select * from servletreg;</s:query>
<table>
<tr>
<td>User Id</td>
<td>User Name</td>
<td>User Email</td>
</tr>
<c:forEach items="${rs.rows }" var="row">
<tr>
<td><c:out value="${row.id }"> </c:out></td>
<td><c:out value="${row.name }"> </c:out></td>
<td><c:out value="${row.email }"> </c:out></td>
</tr>
</c:forEach>

</table>

</body>
</html>