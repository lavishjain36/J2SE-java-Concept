package com.oops.basic.calculator;

public class Demo {
	//static variable
	static int a;
	static int b;


	//static method 
	static void display() {
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	
	//instance variable
	int x;
	int y;
	
	//non-static method 
	{
		System.out.println("Non-Static block or instance block");
		x=30;
		y=40;
	}
	
	//constructor
	Demo(){
		System.out.println("Constructor");
	}
	
	//instance method
	void display1() {
		System.out.println("Non static methor or instance method");
		System.out.println(x);
		System.out.println(y);

	}
	
	//static block
	static {
		System.out.println("Static Block");
		a=10;
		b=20;
	}
	//main method
	public static void main(String[] args) {
		
		//execution start from main method
		
//		Demo.display();//acess static elements
		
//		Demo d=new Demo();//access non-static elements
//		d.display1();
		
		//create object
		Demo d=new Demo();
		System.out.println(d.x);//instance 
		System.out.println(d.y);//instace variable

	}

}
