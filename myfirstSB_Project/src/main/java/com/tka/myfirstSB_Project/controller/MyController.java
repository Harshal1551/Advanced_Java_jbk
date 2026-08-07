package com.tka.myfirstSB_Project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/teams")
	public String firstAPI() {
		return "This is first API";
	}
	
	@GetMapping("/get-data")
	public int[] secAPI() {
		int data []= {1,2,3,4,5};
		return data;
		
	}
	
	@GetMapping("/all-students")
	public List<Student> thirdAPI(){
		List<Student> all = new ArrayList<Student>();
		
		all.add(new Student(1, "jay", 88));
		all.add(new Student(2, "Ram", 70));
		all.add(new Student(3, "Raj", 56));
		all.add(new Student(4, "Amit", 78));
		
		return all;
	}

	
}
