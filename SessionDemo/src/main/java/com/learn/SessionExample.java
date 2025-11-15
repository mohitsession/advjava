package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SessionExample
 */
@WebServlet("/sessionExample")
public class SessionExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");

		// Session Creation
		HttpSession session = request.getSession(); // getSession() either create or return the existing session

		// session timeout
		session.setMaxInactiveInterval(30);

		// Session Maintenance
		session.setAttribute("username", username);

		// session invalidation
//		session.invalidate();

		response.getWriter().append("Session Created and username is set").append(request.getContextPath());
	}

}
