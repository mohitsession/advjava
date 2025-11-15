package com.learn;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			// 1.Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish DB Connection -> Connection object
			String connectionURL = config.getServletContext().getInitParameter("connectionURL");
			String username = config.getServletContext().getInitParameter("username");
			String password = config.getServletContext().getInitParameter("password");
			
			this.connection = DriverManager.getConnection(connectionURL, username, password);
			System.out.println("Connection object is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountUsername = request.getParameter("username");
		String accountPassword = request.getParameter("password");
		try(PreparedStatement ps = connection.prepareStatement("select * from account where username=? and password=?")){
			ps.setString(1, accountUsername);
			ps.setString(2, accountPassword);
			ResultSet executeQuery = ps.executeQuery();
			
			boolean success = false;
			while(executeQuery.next()) {
				success = true;
			}
			if(success) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.html");
				System.out.println("Forwarded the request");
				requestDispatcher.forward(request, response);
			} else {
				response.sendRedirect("default.html");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
