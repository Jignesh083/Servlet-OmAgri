package in.jp.MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExHttpsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		
		PrintWriter out = resp.getWriter();
		out.print("I am in doGet() method for browser.");
		
		System.out.println("I am in doGet() Method.");
	}
}
