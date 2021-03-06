package com.vietjack;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deletePreparedStatementData();
	}
	public static void deleteData() {
		// TODO Auto-generated method stub
		Connection myConn = null;
		Statement myStatement = null;
		// tao connection
		try {
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "lamd3pz4i");
			myStatement = myConn.createStatement();
			String sql = "delete from `employees` where email='david.waters@foo.com'";
			int rowDeleted = myStatement.executeUpdate(sql); // cau lenh them sua xoa
			System.out.println("Delete complete with total: "+rowDeleted);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
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
	public static void deletePreparedStatementData() {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement pr = null;
		// tao connection
		try {
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "lamd3pz4i");
			String sql = "delete from `employees` where salary>=? and department=?";
			pr = myConn.prepareStatement(sql);
			pr.setBigDecimal(1, new BigDecimal(55000.0));
			pr.setString(2, "HR");
			int rowDeleted = pr.executeUpdate(); // cau lenh them sua xoa
			System.out.println("Delete complete with total: "+rowDeleted);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pr!= null)
					pr.close();
				if (myConn != null)
					myConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
