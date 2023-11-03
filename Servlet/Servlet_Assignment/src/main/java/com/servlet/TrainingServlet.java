package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrainingServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Integer training_id=Integer.parseInt(request.getParameter("training_id"))+999;
		String training_name=request.getParameter("training_name");
		String training_sdate=request.getParameter("training_sdate").toString();
		String training_edate=request.getParameter("training_edate").toString();
		String training_mode=request.getParameter("training_mode");
		String businise_unit=request.getParameter("businise_unit");
		String contactperson_id=request.getParameter("contactperson_id");
		try {
			/*Connection con=DataBaseConnection.getConnection();
			String query="INSERT INTO trianing (training_id,training_name,"
					+ "training_sdate,training_edate"
					+ ",training_mode,businise_unit,contactperson_id) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, training_id);
			ps.setString(2, training_name);
			ps.setString(3, training_sdate);
			ps.setString(4, training_edate);
			ps.setString(5, training_mode);
			ps.setString(6, businise_unit);
			ps.setString(7, contactperson_id);
			ps.executeUpdate();
			ps.close();
			con.close();*/
			DataBaseConnection db=new DataBaseConnection();
			db.saveTraining(new Training(training_id, training_name, training_sdate, training_edate, training_mode, businise_unit, contactperson_id));
			pw.println("<h1> Training Add Sucessfully</h1>");
		} 
		catch (Exception e) {
			pw.println("<h1> Training Add Failed !!</h1>");
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			Integer training_id=Integer.parseInt(request.getParameter("training_id"));
			
			try {
				DataBaseConnection db=new DataBaseConnection();
				for(Training t:db.getAllTraining()) {
					if(t.getTrainingId().equals(training_id)) {
						db.delete(t);
						break;
					}
				}
				pw.println("<h1> Training Delete Sucessfully</h1>");
			} 
			catch (Exception e) {
				pw.println("<h1> Training Delete Failed !!</h1>");
				e.printStackTrace();
			}
	}

	

}
