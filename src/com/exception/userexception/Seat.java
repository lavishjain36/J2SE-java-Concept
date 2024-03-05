package com.exception.userexception;

//to book ticket of user or already occupied
public class Seat {
	//field
	private boolean isOccupied;
	//constructor
	public Seat(){
		isOccupied=false;
	}
	
	//method to book the seat
	public void bookSeat() throws InvalidTicketException{
		//logic 
	    if(isOccupied) {
	    	//if already occcupied
	    	throw new InvalidTicketException("Seat already booked by someone...");
	    }else {
			isOccupied=true;
			System.out.println("Seat booked successfully..");
	    }
	}

}
