package com.jp.ServletEx;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// context object initialize
		ServletContext context = getServletContext();
		
		
		ServletConfig config = getServletConfig();
		
		System.out.println("ServletConfig "+getServletConfig());
		System.out.println("ServletContext "+getServletContext());
		resp.getWriter().write("Hello World1 - App Name: "+context.getInitParameter("app_name"));
		resp.getWriter().write("Hello World1 - Init Param: "+config.getInitParameter("name"));
	}
}
