package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<h1> Error Page</h1>");
		pw.println("<h1> Error : "+req.getAttribute("error").toString()+"</h>");
	}

}
