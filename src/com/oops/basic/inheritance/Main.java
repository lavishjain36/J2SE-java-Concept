package com.oops.basic.inheritance;

//class-1st-Parent class 
class A{
	int age;
	String name="swapnil";
	public A(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	A(){
		super();//object class
	}
	
	int age=38;
	
	void display() {
		System.out.println("Name:"+name+" "+"Age: "+age);
	}
}

//established relation b/w class A and B->Inheritance-
//Child class
class B extends A {
	String city;
	public B(int age, String name, String city) {
		super(age, name);
		this.city = city;
	}

	B(){
		super();
	}
	String city="Pune";
	
	void display() {  	  
	System.out.println(city);
	}
}

//ambiguity->Diamond
class C extends B{
	//A and B->will transferred to C
}
public class Main {
	public static void main(String[] args) {
		//create an object of class B
		A obj=new A();
		obj.display();
		
		B obj1=new B();
		obj1.display();

	}
}
