package com.TrackSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String n = req.getParameter("name");
		out.println("Welcome "+n);
		
		
		Cookie ck = new Cookie("uname",n); //Creating cookie object
		resp.addCookie(ck); //adding cookie in the response
		
		//creating submit button
		out.println("<form method='post' action='SecondServlet'>");
		out.println("<input type='submit' value='go'>");
		out.println("</form>");
		
		out.close();
	}
}
