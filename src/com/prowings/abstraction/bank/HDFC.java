package com.prowings.abstraction.bank;

public class HDFC extends Bank{
	private int balance;
	public void deposite(int money)
	{
		balance += money;
	}
	
	public int getBalance() {
		return balance;
	}
	

}
