package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	//Shows welcome message and provides a link to return to the login page
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.print("<h3>Welcome " + request.getParameter("name") + ". </h3>");
		out.print("<a href='index.html'>Return to login</a>");
	}

}
