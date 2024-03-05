package com.oops.basic.inheritance;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an object Manager class
		Manager manager=new Manager("Sohan",10000.0,"Finance");
		Manager devloper1=new Manager("Dhanush",7000.0,"Sr.Developer");

		
		//access manager
		manager.displayDetails();
	}

}
