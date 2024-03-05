package com.oops.basic;

public class Person {
	private String name;//variable->instance variable
	//define variable
	//Constructor->same as classname ->initialize
	//to print the data
	public String getName() {
		return name;
	}
//to set the data 
	public void setName(String name) {
		this.name = name;
	}
	//static method
		public static void main(String[] args) {
			Person p1=new Person();	
		
			p1.setName("Pavithra");
			System.out.println(p1.getName());
	}

}
