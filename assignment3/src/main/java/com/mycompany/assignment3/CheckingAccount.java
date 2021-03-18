
package com.mycompany.assignment3;


public class CheckingAccount extends BankAccount{

	private double insufficientFundsFee;
	private double amount;

	double getInsufficientFundsFee() {
		return insufficientFundsFee;
	}

	public void setInsufficientFundsFee(double insufficientFundsFee) {
		this.insufficientFundsFee = insufficientFundsFee;
	}

	public CheckingAccount(double insufficientFundsFee, String owner, double balance) {
		super(owner, balance);
		this.insufficientFundsFee = insufficientFundsFee;
	}
	
	public void processCheck(double checkAmount){
		this.balance += checkAmount;
	}

	public CheckingAccount(double insufficientFundsFee, double amount, String owner, double balance) {
		super(owner, balance);
		this.insufficientFundsFee = 10;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

	
	
	