
package com.mycompany.assignment3;


public class SavingsAccount extends BankAccount{
	private double interestRate;
	private double annualInterestRate;

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	public SavingsAccount(double annualInterestRate, String owner, double balance) {
		super(owner, balance);
		this.annualInterestRate = annualInterestRate;
	}
	
	public void depositMonthlyIntrest(){
		 this.balance = this.annualInterestRate % 10; 
		
	}
	
	}
	
	


	

