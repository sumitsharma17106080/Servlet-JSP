package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Using_HttpServlet_Extend extends HttpServlet {
//Class HttpServlet  extends GenericServlet
//Class Servlet Method 
//doGet,doPost,doDelete,doPut ,doHead ,doOptions, doTrace, service =>(ServletRequest req, ServletResponse resp)
//getLastModified(ServletRequest req)
//service(HttpServletRequest req,HttpServletResponse resp);
	
// HttpServlet handle protocol specific request
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<h1> Hello I am Sumit Sharma</h1>");
		pw.println("<h1> Using HttpServlet</h1>");
		pw.println("<h1>"+LocalDateTime.now()+"</h1>");
	}

}
