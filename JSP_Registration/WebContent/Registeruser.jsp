<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="com.java.tutorial.LoginUser"%>
<!--     import="com.java.tutorial.RegisterUser"%> Uncomment this to use the 'RegisterUser' Class -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="registerUser" class="com.java.tutorial.LoginBean"></jsp:useBean>

<jsp:setProperty property="*" name="registerUser"/>

<% LoginUser loginuser = new LoginUser();

	if(loginuser.checkLogin(registerUser)){
		out.println("You have been logged in successfully");
	}else{
		out.println("Inncorrect user name and password!");
	}
%>


 <!-- Uncomment this to use the 'RegisterUser' Class
 <% 
 
//  	RegisterUser registeruser = new RegisterUser(); 

//  	if(registeruser.isUserRegistered(registerUser)){
//  		out.println("You have been successfully registered");
//  	}else{
//  		out.println("An error occured while registering user!");
//  	}
%> 
-->

</body>
</html>