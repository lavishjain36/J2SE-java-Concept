package com.oops.basic.calculator;

public class Demo1 {
	//instance variable
	int a;
	int b;

	//instance variable
	 static int count;
	 //instance block
	 {
		 System.out.println("Static block");
		 count++;
	 }
	
	//constructor-1
		Demo1(){
			//intialization of values
		}
	
	//constructor-2
		Demo1(int a){
			//intialization of values
			this.a=a;
		}
		
//constructor-2
		Demo1(int a,int b){
			//intialization of values
			this.a=a;
			this.b=b;
		}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		Demo1 d3=new Demo1();
		
		System.out.println(Demo1.count);//direct acesss

	}

}
