package com.polymorphism.overloading;

//method overloading:1:many->
public class Calculator {
	//method having same name->add method()
	//but argument or parameter->different
	
	//1
	int add(int a,int b) {
		return a+b;
	}
	
	//2
	int add(int a,int b,int c) {
		return a+b+c;//10+30+20=>60
	}
	
	//3
	float add(float a,float b) {
		return a+b;
	}


	double add(double a,double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
	
		//create an object of the class
		Calculator calc=new Calculator();
		
		int a=10,b=30,c=20;//local variable
		
		float m=10.5f,n=20.5f;
		
		float p=5.5f;
	    int q=10;
	    
	    double x=15.5,y=25.5,z=35.5;
		System.out.println(calc.add(a, b));
		System.out.println(calc.add(a, b,c));//method-2//60
		System.out.println(calc.add(m, n));
		System.out.println(calc.add(p, q));
		System.out.println(calc.add(x, y,z));

	}

}
