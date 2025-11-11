package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

	public static void main(String[] args) {
		try {
			// 1.Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish DB Connection -> Connection object
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "admin");

			// 3. Create Statement Object
			Statement statement = connection.createStatement();

			// 4. Submit the sql query to DB
//			int insert = statement.executeUpdate("INSERT INTO account (username, email, password) VALUES "
//					+ "('vikas', 'vikas@gmail.com', 'vikas123'),"
//					+ "('ravi', 'ravi@gmail.com', 'ravi123')");
//			System.out.println("No of rows inserted : " + insert);

//			int update = statement.executeUpdate("UPDATE account SET email='rohit1@gmail' where id=1");
//			System.out.println("No of rows Update : " + update);

//			int delete = statement.executeUpdate("DELETE FROM account WHERE username='rohit'");
//			System.out.println("No of rows Deleted : " + delete);

			ResultSet resultSet = statement.executeQuery("select * from account");

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String userName = resultSet.getString(2);
				String email = resultSet.getString(3);
				String password = resultSet.getString(4);
				String status = resultSet.getString(5);
				System.out.println("id : " + id);
				System.out.println("email : " + email);
				System.out.println("password : " + password);
				System.out.println("status : " + status);
				System.out.println("Username : " + userName);
				System.out.println("-------------------------------");
			}

			// 5. close statement & connection object
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
