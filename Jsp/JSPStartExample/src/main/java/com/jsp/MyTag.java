package com.jsp;

import java.time.LocalTime;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag  extends TagSupport{
	
	public int doStartTag()throws JspException{
		try {
			JspWriter out=pageContext.getOut();
			out.println("<h1>This is My Custorm Tag</h1>");
			out.println("<h1>"+LocalTime.now().toString()+"</h1>");
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return SKIP_BODY;
	}

}
