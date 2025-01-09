package com.Session;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.invalidate(); // object make invalidate means session expired 
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.getWriter().write("Login Servlet from Post method Email: "+email+" Password: "+password);
	}
}
