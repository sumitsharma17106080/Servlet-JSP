package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URLRewrite extends HttpServlet{
	
	public void doGet(HttpServletRequest req ,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
	PrintWriter  pw=	resp.getWriter();
	String email=req.getParameter("name");
	pw.println("<h1> Confirm your email Id :"+email+"</h1>");
		
	}

}
