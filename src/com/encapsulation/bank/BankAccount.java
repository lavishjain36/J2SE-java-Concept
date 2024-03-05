package com.encapsulation.bank;

public class BankAccount {
	//private member -to store the balance
	private double balance;
	
	private boolean Married;
	

	//Getter and setter method for above data member
	

	public double getBalance() {
		return balance;//print 1000
	}
	
	public void setBalance(double balance) {
		//logic->my balance shouldn't negative amount-0
		if(balance>=0) {
			//set the balance value -balance 
			this.balance=balance;
		}else {
			System.out.println("Invalid amount entered by user...Balance can't be negative.");
		}
	}
	


	//instance method to deposit money into account
	public void deposit(double amount) {
//		500>0
		if(amount>0) {
			balance=balance+amount;//1000+500->1500
			System.out.println(amount+" deposited in account..");
		}else {
			System.out.println("Invalid amount..");
		}
	}

	
	//Withdraw->
	public void withdraw(double amount) {
		//logic->2000Rs->10000Rs
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Withdrwal amount"+ amount);
		}else {
			System.out.println("Insuffcient balance..");
		}
		
	}
	
	//Encapsulation->data should be private and getter and setter
	public static void main(String[] args) {
		BankAccount account=new BankAccount();//object creation of class
		
		//setting the values of initial balance using setter
		account.setBalance(1000);//inserting-1000
		
		System.out.println("Initial balance: "+account.getBalance());//printing-1000
		
		//deposit ->500 rs.
		
		account.deposit(500);
		//call getter method
		System.out.println("Balance After deposit "+account.getBalance());//1500
		
		//insert -300
		account.setBalance(-300);
		
	}

}
