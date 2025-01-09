package com.ContactSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ShowContactServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		HashMap<String, String> result =  (HashMap<String, String>) session.getAttribute("contacts");
		Set<String> names = result.keySet();
		
		
		PrintWriter writer = resp.getWriter();
		writer.write("<table border='1'> ");
		
		for(String name : names) {
			String number = result.get(name);
			
			writer.write("<tr>");
			writer.write("<td>"+name+"</td>");
			writer.write("<td>"+number+"</td>");
			writer.write("</tr>");
		}
		
		writer.write("</table>");
		
	}
}
