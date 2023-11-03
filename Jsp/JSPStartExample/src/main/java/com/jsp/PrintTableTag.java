package com.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int doStartTag() throws JspException{
	
		try {
			JspWriter out=pageContext.getOut();
			for(int i=1;i<=10;i++) {
				out.println("<h1>"+i*num+"</h1>");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SKIP_BODY;
	}

}
