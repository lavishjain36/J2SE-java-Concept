package com.oops.basic;

public class Test {

	static int num=10;
	//instance variable
	int num1=20;
	
	//constructor
	Test(){
		System.out.println("Constructor execution...");
	}
	
	//static block
	static {
		System.out.println(num);
		System.out.println("Static Block");
	}
	//instance block
	{
		System.out.println(num1);
		System.out.println("This is instance block");
	}
	
	//static method
	static void m1() {
		System.out.println("Static method");
	}
	
	//instance method
	void m2_instancemethod() {
		System.out.println("Instance method");
	}
	public static void main(String[] args) {
		
		//call static method
		Test.m1();
		Test t1=new Test();
		t1.m2_instancemethod();//access m2 method
	}

}

//1.static variable
//2.static block
//3.static method
//4.non-static methor or instance variable
//5.non-static or instance block
//6.constructor
//7.Method

