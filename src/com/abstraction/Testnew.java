package com.abstraction;


public class Testnew implements Printable,Showable{
	
	@Override
	public void print() {
	//Logic implementation
		System.out.println("Hello.Welcome to interface implemented method....");
	}

	@Override
	public void show() {
		System.out.println("Hello. Welcome to Show method...");		
	}

	public static void main(String[] args) {
		Testnew t=new Testnew();
		t.print();
		t.show();

	}

	
	

}

//Does java support multiple inheritance?
//In java class-inheritance->doesn't support 
//in java interface->multiple inheritance/


