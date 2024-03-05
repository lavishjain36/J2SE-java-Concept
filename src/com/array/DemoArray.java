package com.array;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		
		//Create a Scanner class object to take input from 
		Scanner sc=new Scanner(System.in);
		
		//size of array
		int size=sc.nextInt();//5
		//enter 5 element->entered by user
		
		int[] array=new int[size];//5->heap
		int i;
		
		//read input element from the user->0<5->0 to 4th index
		for( i=0;i<size;i++) {
			array[i]=sc.nextInt();//10 20 15 18 30
		}

		//one more loop to print the array elements
//		for( i=0;i<size;i++) {
//			System.out.print(array[i]+" ");
//		}
		
		System.out.println(array[8]);//at index

	}

}
