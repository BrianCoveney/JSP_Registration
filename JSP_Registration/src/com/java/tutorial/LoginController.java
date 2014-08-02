package com.java.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		 
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(userName);
		loginBean.setPassword(password);
		
		if(loginBean.checkLogin()){
			
			RequestDispatcher dispatch = request.getRequestDispatcher("LoginSuccess.jsp");
			dispatch.forward(request, response);
			
		}else{
			RequestDispatcher dispatch = request.getRequestDispatcher("LoginError.jsp");
			dispatch.forward(request, response);
		}
		
	}

}
