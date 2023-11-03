<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="t"  uri="/WEB-INF/tld/Mylib"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<head>
<title>Home</title>
<meta charset="UTF-8" content="text/html">
</head>
<h2>We are Using @include file tag here for Below header.jsp</h2>
<%@include file="header.jsp"%>
<br>
<h1>First Use Declaration Tag:</h1>
<%!int a = 5;
	int b = 4;
	String str = "Hello How are you";

	public int sum() {
		return a + b;
	}

	public int divide(int x) {
		return a / x;
	}

	public String reverseString() {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}%>
<h1>Second With Scriptlet Tag:</h1>
<%
	out.println("<br>");
out.println("<h2> a=" + a + "</h2");
out.println("<br>");
out.println("<h2> b=" + a + "</h2");
out.println("<br>");
out.println("<h2> Sum=" + sum() + "</h2");
out.println("<br>");
out.println("<h2> Result String =" + reverseString() + "</h2");
out.println("<br>");
%>

<h1>Second With Expression Tag:</h1>
<h2>
	a=<%=a%></h2>
<h2>
	b=<%=a%></h2>
<h2>
	Sum=<%=sum()%></h2>
<h2>
	Result String=<%=reverseString()%></h2>
<h1>Below We Are Using @taglib prefix="c" uri="/jstl/core"</h1>
<c:set var="name" value="Sumit"></c:set>
<h1>
	<c:out value="${name}"></c:out>
</h1>
<h1>
	<c:if test="${3>2 }"> Yes 3 is greater than 2</c:if>
</h1>

<h1>Below for Exception If X value in code 0 , It will generate Exception</h1>
<%
	int x = 5;
%>

<h1>Divide a by x Result=<%=divide(x)%></h1>
<t:myTag ></t:myTag>
<t:myTable num="12"></t:myTable>

</html>
