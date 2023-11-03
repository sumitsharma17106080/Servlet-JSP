<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PAGE 3</title>
<style>
.Class1{
width: 50%;
border: 2px sloid;
margin: auto;
}
</style>
</head>
<body>
	
<div class="Class1">
<%! 
	int n =9;
		
 %>
<%
	 for(int i=1;i<=10;i++){
		out.println("<h1> 9 multiple "+i+" => "+i*n+"</h1>");
	 }
%>
</div>

	
</body>
</html>