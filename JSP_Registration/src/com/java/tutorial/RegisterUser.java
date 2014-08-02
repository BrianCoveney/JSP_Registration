package com.java.tutorial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RegisterUser {

	public boolean isUserRegistered(LoginBean bean){
		
		try{
			
			Connection con = DBConnection.getConnection();
			PreparedStatement psmt = con.prepareStatement("INSERT into USER_LOGIN VALUES(?,?)");
			psmt.setString(1, bean.getUserName());
			psmt.setString(2, bean.getPassword());
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()){
				return true;
			}

			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
		
	}
	
}
