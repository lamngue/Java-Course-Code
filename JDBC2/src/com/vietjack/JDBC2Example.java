package com.vietjack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateData();
	}
	public static void insertData() {
		// TODO Auto-generated method stub
		Connection myConn = null;
		Statement myStatement = null;
		ResultSet myResult = null;
		// tao connection
		try {
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "lamd3pz4i");
			myStatement = myConn.createStatement();
			String sql = "INSERT INTO `employees` (`id`,`last_name`,`first_name`,`email`, `department`, `salary`) VALUES (13,'Nguyen','Lam','lamnemchua@foo.com', 'Dev', 90000.00);";
			myStatement.executeUpdate(sql); // cau lenh them sua xoa
			System.out.println("Update complete");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (myResult != null)
					myResult.close();
				if (myStatement != null)
					myStatement.close();
				if (myConn != null)
					myConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void updateData() {
		Connection myConn = null;
		Statement myStatement = null;
		ResultSet myResult = null;
		// tao connection
		try {
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "lamd3pz4i");
			myStatement = myConn.createStatement();
			String sql = "update `employees` set `email` = 'abcdef@gmail.com' where id ='12'";
			myStatement.executeUpdate(sql); // cau lenh them sua xoa
			System.out.println("Update complete");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (myResult != null)
					myResult.close();
				if (myStatement != null)
					myStatement.close();
				if (myConn != null)
					myConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
