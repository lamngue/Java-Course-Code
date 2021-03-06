package com.vietjack.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vietjack.core.Student;

public class StudentDAO {
	private Connection conn;
	public Connection getConnection() throws SQLException {
		if(conn == null) {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "lamd3pz4i");
			return conn;
		}
		return conn;
	}
	public void closeConnection() {
		if(conn == null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public boolean addNewStudent(Student student) throws SQLException {
		String sql = "insert into student(id,name,email) values(" + student.getId() + ",'" + student.getName() + "','" + student.getEmail() +"')";
		Statement stmt = getConnection().createStatement();
		int n = stmt.executeUpdate(sql);
		if(n != 0) {
			return true;
		}
		return false;
	}
	public boolean ModifyStudent(Student student) throws SQLException {
		String sql = "update student set name='" + student.getName() +"',email='"+student.getEmail()+"' where id ='" + student.getId()+"'";
		Statement stmt = getConnection().createStatement();
		int n = stmt.executeUpdate(sql);
		if(n != 0) {
			return true;
		}
		return false;
	}
	public boolean deleteStudentByName(String name) throws SQLException {
		String sql = "delete from student where name=?";
		PreparedStatement stmt = getConnection().prepareStatement(sql);
		stmt.setString(1, name);
		int n = stmt.executeUpdate();
		if(n != 0) {
			System.out.println("Student deleted");
			return true;
		}
		return false;
	}
	public Student findStudentByName(String name) throws SQLException {
		String query = "select * from student where name='" + name + "'";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
 
		if (resultSet.next()) {
			Student student = new Student();
			student.setId(resultSet.getLong("id"));
			student.setEmail(resultSet.getString("email"));
			student.setName(resultSet.getString("name"));
			return student;
		} else
			return null;
 
	}
	public Student findStudentById(long id) throws SQLException {
		String query = "select * from student where id='" + id + "'";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
 
		if (resultSet.next()) {
			Student student = new Student();
			student.setId(resultSet.getLong("id"));
			student.setEmail(resultSet.getString("email"));
			student.setName(resultSet.getString("name"));
			return student;
		} else
			return null;
 
	}
	public ArrayList<Student> findAll() throws SQLException {
		String query = "select * from student";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		while (resultSet.next()) {
			Student student = new Student();
			student.setId(resultSet.getLong("id"));
			student.setEmail(resultSet.getString("email"));
			student.setName(resultSet.getString("name"));
			studentList.add(student);
		} 
		return studentList;
	}
	
	public long generateId() throws SQLException{
		String query = "select max(id) as maxId from student";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
		ArrayList<Student> studentList=new ArrayList<Student>();
		if (resultSet.next()) {
			return resultSet.getLong("maxId")+1;
		} else{
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
