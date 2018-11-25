package com.vietjack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection myConn = null;
		Statement myStatement = null;
		ResultSet myResult = null;
		//tao connection
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "lamd3pz4i");
			myStatement = myConn.createStatement();
			String sql = "select * from employees";
			myResult = myStatement.executeQuery(sql);
			while(myResult.next()) {
				System.out.println(myResult.getString("last_name")+","+myResult.getString("first_name")+","+myResult.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
