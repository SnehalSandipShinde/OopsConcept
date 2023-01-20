package com.prowings.encapsulation;

public class AccountValues extends AccountVariables{
	public static void main(String[] args) {
		AccountVariables obj = new AccountValues();
//		obj.acc_no= 1234;
		
		obj.setAccNumber(6789045321998l);
		obj.setName("Snehal");
		obj.setEmail("ss0744044@gmail.com");
		obj.setAmout(100000);
		
		show(obj);
		
	}

	public static void show(AccountVariables obj) {
		System.out.println(obj.getAccNumber());
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
		System.out.println(obj.getAmount());
	}

}
