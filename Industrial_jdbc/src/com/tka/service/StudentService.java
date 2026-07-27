package com.tka.service;

import java.util.List;

import com.tka.dao.StudentDAO;
import com.tka.entity.Student;

public class StudentService {
	
	private StudentDAO studentDAO = null;
	

	public List<Student> getAllStudents() {
		studentDAO = new StudentDAO();
		
		List<Student> allStudents = studentDAO.getAllStudents();
		
		
		return allStudents;
	}

	
	
}



