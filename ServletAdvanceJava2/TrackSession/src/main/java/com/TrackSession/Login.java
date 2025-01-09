package com.TrackSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		if(myemail.equals("example@gmail.com") && mypass.equals("example123")) {
//			req.setAttribute("name_key", "example");
			
			HttpSession session  = req.getSession();
			session.setAttribute("name_key", "Jignesh");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red' > Email id and password didn't matched </h3>");
			RequestDispatcher rd1 = req.getRequestDispatcher("/NewFile.html");
			rd1.include(req, resp);
		}
	}
}
