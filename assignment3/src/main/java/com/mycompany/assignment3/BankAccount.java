
package com.mycompany.assignment3;


public class BankAccount{
	
	private String owner;
	double balance;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;

	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		if(amount > 0.0)
		   if(amount > this.balance)
		      System.out.println("Error!");
		else
		     getBalance();
	}

}


