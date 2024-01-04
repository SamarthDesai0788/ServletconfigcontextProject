package com.servletconfig;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		  if (pass.equals("1234")) {
	            Cookie ck = new Cookie("username", name);
	            ck.setMaxAge(100);
	            response.addCookie(ck);
	            response.sendRedirect("WelcomeServlet");
		  }
//	        } else {
//	            // Redirect or handle incorrect password scenario
//	            response.sendRedirect("errorPage");
//	            // You might also want to include a message indicating incorrect credentials
//	        }
	    }
	}