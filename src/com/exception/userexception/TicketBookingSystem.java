package com.exception.userexception;

//Book ticket in railway
public class TicketBookingSystem {

	public static void main(String[] args) {
		Seat seat=new Seat();
		
		//keep your code try-catch block
		try {
			seat.bookSeat();
			seat.bookSeat();
		} catch (InvalidTicketException e) {
			System.out.println("Error :"+e.getMessage());
		}

	}

}
