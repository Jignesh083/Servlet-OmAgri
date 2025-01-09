package com.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try(PrintWriter out = resp.getWriter()){
			out.println("<DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 style='color:blue'>Welcome to Servlet2</h1>");
			
			//url fetch
			String name = req.getParameter("user");
			out.println("<h1 style='color:red'>Welcome back "+name+"</h1>");
			
			out.println("</body>");
			out.println("</html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
