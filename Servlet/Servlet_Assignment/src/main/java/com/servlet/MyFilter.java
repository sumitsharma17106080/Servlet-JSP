package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String username=request.getParameter("User_Name");
		String password=request.getParameter("User_Password");
		String type=request.getParameter("User_Type");
		System.out.println(username+":"+password+":"+type);
		boolean check =false;
		try {
			System.out.println("Entry Try");
			/*Connection con =DataBaseConnection.getConnection();
			String query ="SELECT *  FROM USERS";
			System.out.println(query);
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println(ps);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String user=rs.getString("username");
				String pass=rs.getString("password");
				String typ=rs.getString("type");
				System.out.println(user+":"+pass+":"+typ);
				if(username.equals(user) && password.equals(pass) && type.equals(typ)) {
					request.setAttribute("username",username);
					chain.doFilter(request, response);
					check=true;
					
				}
			}*/
			DataBaseConnection db=new DataBaseConnection();
			List<User> listUser=db.getAllUser();
			for(User rs :listUser) {
				String user=rs.getUsername();
				String pass=rs.getPassword();
				String typ=rs.getType();
				System.out.println(user+":"+pass+":"+typ);
				if(username.equals(user) && password.equals(pass) && type.equals(typ)) {
					request.setAttribute("username",username);
					chain.doFilter(request, response);
					check=true;
				}
			}
			if(!check) {
			request.setAttribute("error","Credentials Mismatch");
			RequestDispatcher rd=request.getRequestDispatcher("/error");
			rd.forward(request, response);}
			
		}
			catch(Exception e) {
			request.setAttribute("error","Credentials Mismatch");
			RequestDispatcher rd=request.getRequestDispatcher("/error");
			rd.forward(request, response);
			
		}
		
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
