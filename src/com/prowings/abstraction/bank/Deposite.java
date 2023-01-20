package com.prowings.abstraction.bank;

public class Deposite {
	public static void main(String[] args) {
		
		SBI obj = new SBI();
		BankOfIndia obj1 = new BankOfIndia();
		HDFC objh = new HDFC();
		
		obj.deposite(100);
		obj1.deposite(150);
		objh.deposite(200);
		
		System.out.println("Balance  of Bank SBI is $"+obj.getBalance());
		System.out.println("Balance  of Bank Bank of India is $"+obj1.getBalance());
		System.out.println("Balance  of Bank HDFC is $"+objh.getBalance());
	}

}
