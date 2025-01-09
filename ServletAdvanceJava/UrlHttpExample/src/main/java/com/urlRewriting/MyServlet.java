package com.urlRewriting;


import java.io.PrintWriter;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		resp.setContentType("text/html");
		try(PrintWriter out = resp.getWriter()){
			out.println("<DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			/* out.println("<h1>Servlet Servlet1 at "+req.getContextPath()+"</h1>"); */
			
			String name = req.getParameter("user_name");
			out.println("<h1> Your Name is: "+name+"</h1>");
			
			
			//Dynamically url creation
			out.println("<a href='Servlet2?user="+name+"'>Go to Second Servlet</a>");
			
			out.println("</body>");
			out.println("</html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
