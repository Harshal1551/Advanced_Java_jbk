package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/register-student")
	public Student registerStudent(@RequestBody Student student) {
		Student st = studentService.registerStudent(student);
		return st;
	}
	
	@GetMapping("/get-allstudents")
	public List<Student> getAllStudents() {
		
		List<Student> st = studentService.getAllStudents();
		
		return st;
	}
	
	
	
	
	
	
	

}
