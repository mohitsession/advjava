package com.learn.util;

import jakarta.servlet.http.HttpServletRequest;

public class AccountUtil {
	
	public static String validateRequest(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.isBlank() || password.isBlank()) {
			return "username Or password should not be blank";
		}
		
		return null;
	}
}
