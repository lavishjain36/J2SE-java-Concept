package com.array.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//no of student from keyboard
		System.out.println("Enter number of the student...");
		int noofstudents=sc.nextInt();//2
		
		//create an array of Student obj.
//		int[] array=new int[size];

		Student[] students=new Student[noofstudents];//array object
		
		//iterate through student data
		for(int i=0;i<noofstudents;i++) {
			System.out.println("Student-"+(i+1));
			String name=sc.next();//lavish
			int rollNumber=sc.nextInt();//101
			double marks=sc.nextDouble();//97
			
			//create each student object and add 
			students[i]=new Student(name,rollNumber,marks);
		}
		
		//print the data  of all students
		System.out.println("All Students details:----------");
		for(int i=0;i<noofstudents;i++) {
			students[i].getData();
			System.out.println("-------------------------------------------");
		}
	}

}

/*
Enter number of the student...
3
Student-1
Praveg
101
78
Student-2
Sharan
102
87
Student-3
Suman
103
78
All Students details:----------
Name: Praveg
Roll Number: 101
Marks 78.0
-------------------------------------------
Name: Sharan
Roll Number: 102
Marks 87.0
-------------------------------------------
Name: Suman
Roll Number: 103
Marks 78.0
-------------------------------------------

*/