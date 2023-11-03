package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Using_GenericServlet_Extend extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	//Abstract Class GenericServlet  implements Servlet interface 
	//Abstract Class GenericServlet have 1 abstract method and other 4 method of Servlet Interface implemented already
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException ,IOException{
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<h1> Hello I am Sumit </h1>");
		pw.println("<h1> Using GenericServlet abstract Class </h1>");
		pw.println("<h1>"+ LocalDateTime.now()+"</h1>");
		
	}

	

}
