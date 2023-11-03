package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("User_Name");
		String password=request.getParameter("User_Password");
		String type=request.getParameter("User_Type");
		try {
			DataBaseConnection db=new DataBaseConnection();
			/*Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO USERS (username,password,type) VALUES (?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, type);
			ps.executeUpdate();
			ps.close();
			con.close();*/
			db.saveUser(new User(username,password,type));
			pw.println("<h1> Register Sucessfully</h1>");
		} 
		catch (Exception e) {
			pw.println("<h1> Register Sucessfully</h1>");
		
		}
	}

}
