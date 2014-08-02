package com.java.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	

	public static Connection getConnection(){
		
		Connection conn = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/JSP_Servlet?"+
					"user=root&password=bossdog12"); 
			
			if(conn != null){
				System.out.println("Connection to the database was successfull!");
			}
			
		}catch(Exception exp){
			exp.printStackTrace();
		}
		
		return conn;
		
	}
	

}
