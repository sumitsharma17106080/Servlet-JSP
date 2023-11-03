package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {
	
	public static List<User> listUser=new ArrayList<>();
	public static List<Training> listTrianing=new ArrayList<>();
	
	
	protected static Connection getConnection() throws SQLException ,ClassNotFoundException{
		String driver_class_name="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Pass@123";
		System.out.println("Driver Before");
		Class.forName(driver_class_name);
		
		Connection con =DriverManager.getConnection(url, username, password);
		System.out.println("Con Afrer:"+con);
		return con;
	}
	
	
	
	
	

	public User saveUser(User user) {
		listUser.add(user);
		return user;
	}
	public List<User> getAllUser(){
		
		return this.listUser;
	}
	public static void db() {
		listUser.add(new User("sumit@gmail.com","1998","E"));
		listUser.add(new User("ankit@gmail.com","1994","A"));
	}

	public static void dbT() {
	
		listTrianing.add(new Training(1,"Java","13/12/2022","30/12/2023","Online","b123","20123123"));
		listTrianing.add(new Training(2,"Servlet JSP","3/12/2022","12/12/2023","Online","b321","232123123"));
	}
	public Training saveTraining(Training t) {
	
		listTrianing.add(t);
		return t;
	}
	public List<Training> getAllTraining(){

		return this.listTrianing;
	}
	public void delete(Training t) {
		this.listTrianing.remove(t);
	}
	public DataBaseConnection() {
		super();
	
	
	}
	
}
