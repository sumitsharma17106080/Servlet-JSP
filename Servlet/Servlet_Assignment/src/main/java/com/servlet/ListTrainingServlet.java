package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListTrainingServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		Connection con =null;
		try {
			 DataBaseConnection db=new DataBaseConnection();
			 
			for(Training rs:db.getAllTraining()) {
				int training_id=rs.getTrainingId();
				String training_name=rs.getTrainingName();
				String training_sdate=rs.getTrainingSdate();
				String training_edate=rs.getTrainingEdate();
				String training_mode=rs.getTrainingMode();
				String businise_unit=rs.getBusiniseUnit();
				String contactperson_id=rs.getContactpersonId();
				pw.println("<h5>"
						+"Training Id:"+training_id
						+", Training Name:"+training_name
						+", Training Start Date:"+training_sdate
						+", Training End Date:"+training_edate
						+", Training Mode:"+training_mode
						+", Business Unit:"+businise_unit
						+", Contact Person Id:"+contactperson_id
						+ "</h5>"
						);
				
			}
		} catch (Exception e) {
			pw.println("<h1> List of Training Fetch Failed</h1>");
			e.printStackTrace();
		}
		
	}
	

}
