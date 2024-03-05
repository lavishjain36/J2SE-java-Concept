package com.oops.basic.inheritance;

//Parent Class->
public class Employee {
	//data member
	private String name;
	private double salary;
	//Constructor of EMployee with name and salary
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	//method 
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}

}
