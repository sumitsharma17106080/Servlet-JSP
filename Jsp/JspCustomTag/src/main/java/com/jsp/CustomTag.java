package com.jsp;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTag  extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h1>THis is my Custom Tag</h1>");
			out.print(new Date().toString());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	

}
