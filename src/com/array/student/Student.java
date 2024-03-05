package com.array.student;

public class Student {
	public Student(String name, int rollNumber, double marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	//fields->
	private String name;
	private int rollNumber;
	private double marks;
	
	//constructor
	
	//method that will print the data of student
	public void getData() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Marks "+marks);
	}

}
