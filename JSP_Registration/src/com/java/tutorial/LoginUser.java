package com.java.tutorial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginUser {
	
	
	public boolean checkLogin(LoginBean bean){
			
		try{
			
			Connection con = DBConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement
					("select USER_NAME from USER_LOGIN where USER_NAME=? and PASS_WORD=?");
			stmt.setString(1, bean.getUserName());
			stmt.setString(2,  bean.getPassword());
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				return true;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

}
