package com.exception;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
	//Developing calculator
		System.out.println("Connection to calculator is established");
		
		//2->take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 to divide");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2 to divide");
		int num2=sc.nextInt();
		
		//Logic->num1/num2
		int res=num1/num2;//10/0
		
		//3.terminate connection
		System.out.println("Connection terminated");
		
				
	}

}
