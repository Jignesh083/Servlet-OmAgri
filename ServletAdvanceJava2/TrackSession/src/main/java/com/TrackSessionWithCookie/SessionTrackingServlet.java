package com.TrackSessionWithCookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SessionTrackingServlet extends HttpServlet {
	    // Override the doGet method to handle the HTTP GET request
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        // Set content type for the response
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        // Get the cookies from the request
	        Cookie[] cookies = request.getCookies();
	        int visitCount = 0;

	        if (cookies != null) {
	            // Check for the 'visitCount' cookie
	            for (Cookie cookie : cookies) {
	                if (cookie.getName().equals("visitCount")) {
	                    try {
	                        // Retrieve the current visit count and increment it
	                        visitCount = Integer.parseInt(cookie.getValue());
	                    } catch (NumberFormatException e) {
	                        // In case the cookie value isn't a valid number
	                        visitCount = 0;
	                    }
	                    break;
	                }
	            }
	        }

	        // Increment the visit count
	        visitCount++;

	        // Create a new cookie to store the updated visit count
	        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
	        visitCookie.setMaxAge(2); // Set cookie expiration to 1 day
	        response.addCookie(visitCookie); // Add the cookie to the response

	        // Display the visit count to the user
	        out.println("<html>");
	        out.println("<head><title>Session Tracking with Cookies</title></head>");
	        out.println("<body>");
	        out.println("<h1>Welcome to the site!</h1>");
	        out.println("<p>Your visit number is: " + visitCount + "</p>");
	        out.println("</body>");
	        out.println("</html>");
	    }
	}
