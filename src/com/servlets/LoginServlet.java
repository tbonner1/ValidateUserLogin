package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	//Called initially
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		String desiredName = "admin";
		String desiredPassword = "password";
		
		//Run the success servlet when the desired name and password are entered into the login page
		if(name.equals(desiredName) && password.equals(desiredPassword))
		{
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		//Otherwise add the invalid response to the index.html
		else
		{
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out = response.getWriter();
			rd.include(request, response);
			out.println("<h4><span style='color:red'>Invalid Credentials! Please try again.</h4>");
		}
	}

}
