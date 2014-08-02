package com.java.tutorial;

public class LoginBean {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkLogin(){
		
		if("admin".equals(getUserName()) && "admin".equals(getPassword())){
			return true;
		}else{
			return false;
		}
	}

}
