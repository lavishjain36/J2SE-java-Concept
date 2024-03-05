package com.exception;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
	//Developing calculator
		System.out.println("Connection to calculator is established");
		
		try {
			//risk code block
			int num1=10,num2=0;
			int res=num1/num2;//10/0
			System.out.println(res);
			
		} catch (Exception e) {
			System.out.println("Can not divide by zero.enter positive value");
			e.printStackTrace();
		}
		System.out.println("Connection terminated");
		
	}

}
