package com.jp.ServletEx;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		ServletConfig config = getServletConfig();
		
		
		int rupeeinOneDoller = Integer.parseInt(config.getInitParameter("rupee_in_one_doller"));
		
 		
		System.out.println("ServletConfig "+getServletConfig());
		System.out.println("ServletContext "+getServletContext());
		resp.getWriter().write("Hello World + App Name: "+context.getInitParameter("app_name"));
		resp.getWriter().write(" Hello World + Init Param: "+config.getInitParameter("name"));
		resp.getWriter().write(" My Servlet Init Param: "+rupeeinOneDoller * 5);
		}
	
}
