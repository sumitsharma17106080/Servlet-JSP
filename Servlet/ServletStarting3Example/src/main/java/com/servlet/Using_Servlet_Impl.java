package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Using_Servlet_Impl  implements Servlet{
	
	// Servlet Interface Have  5  method  3 lifecycle  + 2 Normal method 
	ServletConfig servletConfig;
	
	public void init(ServletConfig servletConfig) {
		this.servletConfig=servletConfig;
		System.out.println("Creating Object");
	}
	
	public ServletConfig getServletConfig() {
		return servletConfig;
	}
	
	public void service(ServletRequest servletRequest,ServletResponse servletResponse)throws ServletException ,IOException {
		System.out.println("Service...");
		servletResponse.setContentType("text/html");
		PrintWriter pw=servletResponse.getWriter();
		pw.println("<h1>Hello I am Sumit</h1>");
		pw.println("<h1> Using Servlet Interface </h1>");
		pw.println("<h1>"+LocalDateTime.now()+"</h1>");
		
	}
	
	
	public String getServletInfo() {
		return servletConfig.getServletName();
	}
	
	public void destroy() {
		System.out.println("Destroying "+servletConfig.getServletName()+"...");
		
	}
	

	
}
