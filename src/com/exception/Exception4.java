package com.exception;

public class Exception4 {

	//StringIndexOutofBound Exception
	public static void main(String[] args) {
		
		try {
			String text="hello buddy";
			char c=text.charAt(40);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Rest of the code....");
		System.out.println("Rest of the code....");
		System.out.println("Rest of the code....");	
	}

}
