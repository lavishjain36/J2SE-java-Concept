package com.abstraction;

//becomes abstract-class-can't create object
 abstract class Test {

	//normal method or abstract method
	abstract void m1();//unimplemented method
	abstract void m2();
	
	//instance or normal method
	void m3() {
		System.out.println("Method-m2");
	}

}


 public class Main extends Testnew{
	@Override
	void m1() {
		System.out.println("M1 method");
		
	}

	@Override
	void m2() {
		System.out.println("M2 Method");
	}
	
	public static void main(String[] args) {
		Main obj=new Main();
		obj.m1();
		obj.m2();
	}
}


//1.abstract class-object creation is not possible
//Abstract methods do not specify a body