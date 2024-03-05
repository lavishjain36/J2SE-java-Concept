package com.relationship;

public class DriverMain {

	public static void main(String[] args) {
		//Create object of engine
		Engine engineobj=new Engine(200);
		//Create a car object
		Car car1=new Car("Thar Jeep",engineobj);
		car1.startcar();
		System.out.println();
	}

}
