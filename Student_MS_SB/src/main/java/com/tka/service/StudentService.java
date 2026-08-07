package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public Student registerStudent(Student student) {
		
		Student st = studentDao.registerStudent(student);
		
		return st;
	}

	

	public List<Student> getAllStudents() {
		
		List<Student>st = studentDao.getAllStudent();
		
		return st;
	}
	

}
