package com.food;

import java.util.Scanner;

public class FoodEat {

	public static void main(String[] args) {
		//Scanner class object to read the input
		Scanner sc=new Scanner(System.in);//heap memory area
		System.out.println("Are you hungry?(yes/no)");
		
		String foodchoice=sc.nextLine();//provide the input through keyboard-yes
		
		if(foodchoice.equals("yes")) {
			System.out.println("Let's eat Burger...");
		}else {
			System.out.println("Let's have some air..");
		}

	}

}
