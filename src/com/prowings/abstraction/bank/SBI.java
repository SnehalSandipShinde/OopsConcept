package com.prowings.abstraction.bank;

public class SBI extends Bank {
	private int balance;
	
	public void deposite(int money )
	{
		balance += money;
	}
	public int getBalance() 
	{
		return balance;

	}

}
