package com.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport{
	
	private int number;
	

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out=pageContext.getOut();
			for(int i=1;i<=10;i++)
				out.println("<h2>"+i*number+"</h2>");
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return SKIP_BODY;
	
	}
	
	

}
