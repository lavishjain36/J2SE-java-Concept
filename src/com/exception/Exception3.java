package com.exception;

public class Exception3 {

	//NullPointerException
	public static void main(String[] args) {
		
		try {
			String text=null;//null value
			System.out.println(text.charAt(0));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//complete tracing of the error
//			e.getMessage();
			System.out.println("Null Pointer Exception...");
		}finally {
			//it will always execute
		}
	}

}
