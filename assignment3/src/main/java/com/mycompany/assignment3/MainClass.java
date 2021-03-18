
package com.mycompany.assignment3;


public class MainClass {
	
	public static void main(String[] args){
		
	SavingsAccount mySavings = new SavingsAccount(0.01,"Joe",100);
	
	SavingsAccount mySavings02 = new SavingsAccount(0.5,"Sam",100);
	
	CheckingAccount myChecking = new CheckingAccount(-10,"Emily",200);
	
	myChecking.deposit(50);
	mySavings.withdraw(25);
	myChecking.withdraw(100);
	mySavings.deposit(100);
	mySavings.depositMonthlyIntrest();
	mySavings02.depositMonthlyIntrest();
	myChecking.withdraw(500);
	mySavings.withdraw(500);
	

		
	}
	
}
