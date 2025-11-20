package com.learn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.learn.bean.AccountBean;

import jakarta.servlet.RequestDispatcher;

public class AccountDAO {

	public AccountBean getAccountBean(AccountBean accountBean) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "admin");
			try (PreparedStatement ps = connection
					.prepareStatement("select email,status from account where username=? and password=?")) {
				ps.setString(1, accountBean.getUsername());
				ps.setString(2, accountBean.getPassword());
				ResultSet resultSet = ps.executeQuery();

				while (resultSet.next()) {
					accountBean.setEmail(resultSet.getString(1));
					accountBean.setStatus(resultSet.getString(2));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accountBean;
	}

}
