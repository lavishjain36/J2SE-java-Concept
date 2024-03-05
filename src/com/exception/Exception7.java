package com.exception;


public class Exception7 {
	
	public static void print(int age) {
		if(age>=18) {
			System.out.println("Eligible for voting....");
		}else {
			throw new IllegalArgumentException("Not Eligible for Voting...");
		}
		
	}
	public static void main(String[] args) {
		
		//call static method print
		Exception7.print(18);
	}
}
