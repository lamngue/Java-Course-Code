package com.vietjack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataExample {
	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "lamd3pz4i");

			// 2. Run query
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select id, last_name, first_name, salary from employees");
			//3 . lay ket qua metadata tra ve
			ResultSetMetaData rsMeta= myRs.getMetaData();
			int columnCount=rsMeta.getColumnCount();
			for(int column=1;column<=columnCount;column++){
				System.out.println("Column name:"+rsMeta.getColumnName(column));
				System.out.println("Column type name:"+rsMeta.getColumnTypeName(column));
				System.out.println("is nullable:"+rsMeta.isNullable(column));
				System.out.println("is auto increment:"+rsMeta.isAutoIncrement(column));
				System.out.println("-------------");
			}
			
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			close(myConn, myStmt, myRs);
		}
	}

	private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
			throws SQLException {

		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}
}

