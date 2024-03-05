package com.oops.basic.calculator;

public class Calculator2 {
	int num1,num2,num3;//instance variable
	
	//instance method-addition
   int add(int num1,int num2) {
		num3=num1+num2;//addition logic
		return num3;
	}

		
	
	//develop a method subtraction
	int subtract(int num1,int num2) {
		num3=num1-num2;
		return num3;
	}

	public static void main(String[] args) {
		
		//create an object of the class
		Calculator2 calc=new Calculator2();//object creation
		
		//call the method->objereference.methodname();
		System.out.println(calc.add(10,20));//parameter
		
		System.out.println(calc.subtract(20,7));

	}

}
