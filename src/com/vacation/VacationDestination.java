package com.vacation;

import java.util.Scanner;

public class VacationDestination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What type of vacation do you prefer?(beach/mountain/city)");
		String placechoice=sc.nextLine();
		if(placechoice.equalsIgnoreCase("beach")) {
			System.out.println("Pack the bag and lets go to beach side...");
		}else if(placechoice.equalsIgnoreCase("mountain")) {
			System.out.println("Pack the bag and lets go for tracking to mountain side..");
		}else if(placechoice.equals("city")) {
			System.out.println("Let's go to busy life of city and enjoy the traffic...");
		}else {
			System.out.println("Lets go for workation or staycation...");
		}
	}
}
