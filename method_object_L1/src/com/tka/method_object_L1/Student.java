package com.tka.method_object_L1;

public class Student {

	int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
    
}
