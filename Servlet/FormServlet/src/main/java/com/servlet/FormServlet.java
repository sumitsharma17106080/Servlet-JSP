package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormServlet  extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException ,IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("User_Name");
		String course =req.getParameter("user_course");
		String checked=req.getParameter("condition");
		if(checked!=null) {
		pw.println("<h1> Welcome "+name+"</h1>");
		pw.println("<h1>  Email :"+req.getParameter("User_Email")+"</h1>");
		pw.println("<h1> Gender :"+req.getParameter("User_gender")+"</h1>");
		pw.println("<h1> Course : "+course+"</h1>");
		
		Cookie c1=new Cookie("name",name );
		resp.addCookie(c1);
		
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		
		RequestDispatcher rd=req.getRequestDispatcher("success");
		req.setAttribute("description",name+", you select "+course);
		rd.forward(req, resp);
		}
		else {
			pw.println("<h1> Sorry!! You did not accept terms and condition</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
		}
		
		
		
		
	}

}
