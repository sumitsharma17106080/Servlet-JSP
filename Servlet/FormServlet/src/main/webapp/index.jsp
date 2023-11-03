<html>
<head>
<title>Form Page</title>
<style>
.c{
width: 40%;border: 1px solid;margin: auto;
}

</style>
</head>
<body>
<div class="c">
<h1>Course Application Form</h1>
	<form action="register" method="post">
		<table>
			<tr>
			<td>Enter Your Name</td>
			<td><input id="name" type="text" name ="User_Name"/></td>
			</tr>
			<tr>
			<td>Enter Your Email Id</td>
			<td><input type="email" name ="User_Email"/></td>
			</tr>
			<tr>
			<td>Enter Email Password</td>
			<td><input type="password" name ="Email_Password"/></td>
			</tr>
			<tr>
			<td>Enter Gender</td>
			<td><input type="radio" name ="User_gender" value="Male"/>Male &nbsp;&nbsp;<input type="radio" name ="User_gender" value="Female"/>Female &nbsp;&nbsp</td>
			</tr>
			<tr>
				<td>Enter Your course</td>
				<td><select name="user_course">
						<option value="java">Java<option>
						<option value="php">PHP<option>
						<option value="python">Python<option>
						<option value="C++">C++<option>
				</select></td>
			</tr>
			<tr>
			
			<td style="text-align: right;"><input type="checkbox" name="condition" value="checked"/></td>
			<td>terms and condition</td>
			</tr>
			<tr>
				<td  style="text-align: right;"><input type="submit" /></td>
				<td><input type="reset"/></td>
		
			</tr>
		</table>
		
	</form>
</div>
</body>
</html>
