package com.exception.userexception;

//will create invalidticketexception->inheritance
public class InvalidTicketException extends Exception {
	
//constructor to set the error message
	
	public InvalidTicketException(String message) {
		super(message);//that will throw an error message
	}
}
