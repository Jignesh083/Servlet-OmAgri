import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HiddenFieldServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the form data from the request
		String username = req.getParameter("username");
		String hiddenData = req.getParameter("hiddenData");
		
        // Set the response type
		resp.setContentType("text/html");
		
     
		PrintWriter out = resp.getWriter();
		 out.println("<html><body>");
	        out.println("<h1>Form Data Received</h1>");
	        out.println("<p>Username: " + username + "</p>");
	        out.println("<p>Hidden Data: " + hiddenData + "</p>");
	        out.println("</body></html>");
	}
}
