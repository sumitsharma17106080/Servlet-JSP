package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

public class SuccessServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException ,IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String email=req.getParameter("User_Email");
		String description=req.getAttribute("description").toString();
		pw.println("<h1>"+description+"!! your data is store successfully</h1>");
		pw.println("<h1> Your Email Id :"+email+"</h1>");
		pw.println("<h1><a href='re_write_url?name="+email+"'>Go ReWrite_URL</a></h1>");
		
	}
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException ,IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		Cookie[] cookie=req.getCookies();
		String name=null;
		if(cookie!=null) {
		for(Cookie cook:cookie) {
		String tname=cook.getName();
		if(tname.equals("name")) name=cook.getValue();
		
		break;
							}
		}
		HttpSession session=req.getSession();
		String name2=session.getAttribute("name").toString();
		pw.println("<h1>"+name+"!! your data is store successfully</h1>");
		pw.println("<h1>"+name2+"!! Are You There!</h1>");
		
	}

}
