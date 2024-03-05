package com.oops.basic.calculator;

public class Calculator {
	int num1,num2,num3;//instance variable
	
	public Calculator(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	//instance method-addition
	int add() {
		num1=10;
		num2=20;
		num3=num1+num2;//addition logic
		return num3;
	}
	
	//develop a method subtraction
	int subtract() {
		num1=10;
		num2=5;
		num3=num1-num2;
		return num3;
	}

	public static void main(String[] args) {
		
		//create an object of the class
		Calculator calc=new Calculator();//object creation
		
		//call the method->objereference.methodname();
		System.out.println(calc.add());
		
		System.out.println(calc.subtract());

	}

}
