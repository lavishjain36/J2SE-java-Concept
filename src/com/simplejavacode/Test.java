package com.simplejavacode;

import java.awt.print.Printable;
import java.io.Serializable;

class Test {

//java main method
	public static void main(String[] args) {
		//it evaluates only=>boolean condition.
//		int num=5;//5
//		System.out.print(num++);//5->internally->(6)
//		System.out.print(++num);//7->internally=(7)
//		System.out.print(num--);//7->internally(6)
//		System.out.print(--num);//5->internally(5)
//		
//		int k=10;
//		System.out.println(++k);//11->internally(11)
//		System.out.println(k--);//11->internally(10)
//		System.out.println(k++);//10->internally(11)
//		System.out.println(k);//11->internally(11)
//		System.out.println(--k);//10->internally(10)
		
		
		
		//<< and >>->Bitwise left and right shift.->bit by bit operation->0 and 1's
//		System.out.println(8<<2);
//		System.out.println(",");
//		System.out.println(8>>2);
//		
//		System.out.print(4<<1);//8
//		System.out.print(4>>1);//2
		
		
		
		
//		int num1=15;
//		int num2=5;
//		
////		%->reminder/modulous ->15%12->3
//		System.out.print(num1%num2);//3
//		System.out.print(",");
//		System.out.print(num2%num1);//12
////		5%15->smaller number will be reminder

		
		
		
		int num1=7;
		int num2=10;
		boolean flag=num1>num2;//7>10->false
		System.out.println(!flag);//true
		
		
		
		//Ternary Operator->its replacement to if-else
		
//		int num=10;
//		String result=num<5?"Hello":"Bye";
//		System.out.println(result);
		
		
		
		
		//Looping
//		for(int i=10;i>0;--i) {
//			System.out.print(i+" ");//10 9  8 7 6  5 4  3 2 1
//		}
		
		
		//initialization
//		for(int i=55;i<70;i=i+1) {
//			System.out.print(" "+i);
//			i++;
//		}
//		
//		
//		System.out.println("\n");
//		//initialization
//		int i=70;
//		for(;i>60;) {
		   
//			System.out.print(" "+i);//70 69 68----61
//			i--;
//		}
		
		
		//runs code infinite times
//		initialization->No
//		incrementation->No->this will code run infinite times.
//		for(;;) {
//			System.out.println("Run the code.");
//		}

		
//		int i=0;
//		while(i<10) {
//			i++;
//			System.out.print(i+" ");
//			
//		}
		
//		for(int i=0;i<10;) {
//			i++;//1
//			System.out.print(i+" ");//1  4  7  10
//		}
		
		
//		int i=0;
//		while(i<10) {
//			++i;
//			System.out.print(i+" ");
//			
//			//i need print upto 10 values and then stop it
//			if(i==10) {
//				break;
//			}
//		}
		
		//write code to print values from 1 to 10 except 5 & 7
//		int i=0;
//		while(i<10) {
//			++i;	
//			//i should skip value 5 and then move to 6 
//			if(i==5 || i==7) {
//				continue;//is to skip a part of iteration and execute the rest of the code.
//			}
//			System.out.print(i+" ");
//		}
		
		
		int i=0;
		while(i<10) {
			++i;
			if((i%2)==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	
	
}


//even 
//odd 