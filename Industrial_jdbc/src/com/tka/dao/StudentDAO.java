package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Student;

public class StudentDAO {
	
	private String path_driver = "com.mysql.cj.jdbc.Driver";

	private String url = "jdbc:mysql://localhost:3306/adv_java"; 
	private String uname = "root";
	private String password = "123456";
	
	private Connection conn = null;
	private Statement st = null;

	private String query = "select * from student";
	
	private ResultSet rs = null;

	private ArrayList<Student> allstudents = null;
	
	


	public List<Student> getAllStudents() {
		
		try {
			
			Class.forName(path_driver);
			
			conn = DriverManager.getConnection(url, uname, password);
			
			st = conn.createStatement();
		
			rs = st.executeQuery(query);
			
			allstudents  = new ArrayList<Student>();
			
			while(rs.next()) {
//				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+ rs.getInt(3));
				
				Student obj = new Student();
				obj.setRoll(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setMarks(rs.getInt(3));
				
				allstudents.add(obj);
			
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return allstudents;
		
	}

	
}
