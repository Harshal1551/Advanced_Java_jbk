package com.tka.controller;

import java.util.List;

import com.tka.entity.Student;
import com.tka.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();

		List<Student> allstudents = studentService.getAllStudents();

		for (Student s : allstudents) {
			System.out.println(s.getRoll() + "-----> " + s.getName() + "-------> " + s.getMarks());

		}

	}
}

