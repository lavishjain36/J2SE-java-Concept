package com.polymorphism.overriding;

//method overriding->Runtime polymorphism.
public class MainDriver {

	public static void main(String[] args) {
		
		//create an SBI
		SbiBank sb=new SbiBank();
		ICICIBank ic=new ICICIBank();
		AxisBank ax=new AxisBank();
		
		System.out.println("Sbi rate of interest :"+sb.getRateofInterest());
		System.out.println("ICIC rate of interest :"+ic.getRateofInterest());
		System.out.println("Axis rate of interest :"+ax.getRateofInterest());
	}

}
