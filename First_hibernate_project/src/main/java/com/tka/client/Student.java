package com.tka.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", schema = "adv_java")
public class Student {

	@Id
	private int roll; 
	
	@Column(name = "sname")
	private String sname;
	private int marks;
	
	public Student() {
		
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int roll, String sname, int marks) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	
	
	
}
