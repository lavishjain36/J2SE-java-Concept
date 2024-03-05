package com.university;

import java.util.ArrayList;
import java.util.List;

public class University {

	private String name;
	private List<Department> departments;

	public University(String name) {
		this.name=name;
		this.departments=new ArrayList<>();
	}
	
	//instance method
	public void addDepartment(String name) {
		Department dept=new Department(name);
		departments.add(dept);
	}
	
	
	
	//Inner class Department 
	public class Department{
			private String name;
			private List<Professor> professors;

			public Department(String name) {
			this.name = name;
			this.professors = new ArrayList<>();
			}

			
			//inner class Professors
			public class Professor{
				private String name;

				public Professor(String name) {
					this.name = name;
				}

				
			}
	}

}
