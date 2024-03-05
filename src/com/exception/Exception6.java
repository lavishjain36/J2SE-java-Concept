package com.exception;

//NumberFormat Exception
public class Exception6 {
	public static void main(String[] args) {
		
		try {
			int num=Integer.parseInt("lavish");
			System.out.println(num);
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("NumberFormat Exception..");
		}
	}
}

//lavish->number?