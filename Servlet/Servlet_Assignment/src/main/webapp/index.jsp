<html>
<head>
<title>Index</title>
<style >
.Class1{ width: 50%; border: 2px solid;margin: auto;
}
</style>

</head>
<body>
<h2>Hello World!</h2>
<form action="register" method="post">
<div>
		<table>

			<tr>
				<td>Enter Your Username(Email Id)</td>
				<td><input type="email" name="User_Name" /></td>
			</tr>
			<tr>
				<td>Enter Email Password</td>
				<td><input type="password" name="User_Password" /></td>
			</tr>

			<tr>
				<td>Enter Your Type</td>
				<td><select name="User_Type">
						<option value="A">Admin
						<option>
						<option value="E">Employee
						<option>
				</select></td>
			</tr>

			<tr>
				<td style="text-align: right;"><input type="submit" /></td>
				<td><input type="reset" /></td>

			</tr>
		</table>

	</form>
</div>	
</body>
</html>
