package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignIn extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)  throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
	/*	String username=req.getParameter("User_Name");
		String password=req.getParameter("User_Password");
		String type=req.getParameter("User_Type");
		boolean check =false;
		try {
			Connection con =DataBaseConnection.getConnection();
			String query ="SELECT *  FROM USERS";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String user=rs.getString("username");
				String pass=rs.getString("password");
				String typ=rs.getString("type");
				if(username.equals(user) && password.equals(pass) && type.equals(typ)) {*/
		try {
		String type=req.getParameter("User_Type");
		boolean check =false;
		if(type.equals("A")) {
			RequestDispatcher rd=req.getRequestDispatcher("/adminhome");
			rd.forward(req, resp);
			check =true;
					}
		else if(type.equals("E")) {
			RequestDispatcher rd=req.getRequestDispatcher("/emphome");
			rd.forward(req, resp);
			check =true;
						}
					
		if(!check) throw new Exception();
		
		
		}
	catch (Exception e) {
			req.setAttribute("error", "Credentials Mismatch");
			RequestDispatcher rd=req.getRequestDispatcher("/error");
			rd.forward(req, resp);
			System.out.println(e);
		}
		
	}

}
