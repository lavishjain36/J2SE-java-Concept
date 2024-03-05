package com.oops.basic.inheritance;

//inheritance
public class Manager extends Employee {
	private String department;
	
	//constructor with super keyword->
	public Manager(String name,double salary,String department) {
		super(name, salary);//access from parent class
		this.department=department;
	}

	
	@Override
	public void displayDetails() {
		//super method to call name and salary from employee.
		super.displayDetails();
		System.out.println("Department "+department);	

	}
}
