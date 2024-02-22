package com.food;

public class Nestedif {

	public static void main(String[] args) {
		int num1=40;
		int num2=20;
		//Nested if
		if(num1==10) {
			if(num2==25) {
				System.out.println("10 and 20 are present..");
			}else {
				System.out.println("10 and 20 are not present..");
			}
		}else {
			System.out.println("10 itself is not present..");
		}
	}

}
