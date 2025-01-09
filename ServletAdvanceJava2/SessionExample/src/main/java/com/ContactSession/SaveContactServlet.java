package com.ContactSession;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SaveContactServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pNumber = req.getParameter("mobile");
		HttpSession session = req.getSession();
		
		HashMap<String,String> contacts = (HashMap<String, String>) session.getAttribute("contacts");
		
		
		if(contacts==null) {
			contacts = new HashMap();
		}
		
		contacts.put(name, pNumber);
		
		session.setAttribute("contacts",contacts);
		
		//serve Page Again and again 
		req.getRequestDispatcher("Contact.jsp").forward(req, resp);
	}
}
