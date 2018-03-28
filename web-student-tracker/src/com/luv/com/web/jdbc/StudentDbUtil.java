package com.luv.com.web.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {
	//EU DataSource is the source in the TomCat
	private DataSource dataSource;
	
	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Student> getStudent()throws Exception{
		List<Student> students = new ArrayList<>();

		try(Connection myConn = dataSource.getConnection();
			Statement myStmt = myConn.createStatement();) {
		
			//create sql statement
			String sql= "select * from student order last_name";
			
			//execute query
			ResultSet myRst = myStmt.executeQuery(sql);
			
			//process result set
			while(myRst.next()) {
				//retrieve data from result set now
				int id = myRst.getInt("id");
				String firstName= myRst.getString("first_name");
				String lastName= myRst.getString("last_name");
				String email= myRst.getString("email");
				
				//create new student object
				Student tempStudent= new Student(id, firstName, lastName, email);
				
				//add it to the list of students
				students.add(tempStudent);
			}			
		}
		return students;
	}
}
