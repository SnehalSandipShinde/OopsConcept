package com.prowings.encapsulation;

public class AccountVariables {
	
	private long acc_no;
	private String name , emailId;
	private float amount;
	
	public long getAccNumber() {
		return acc_no;
	}
	public void setAccNumber(long acc_no) {
		this.acc_no = acc_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nm) {
		this.name = nm;
	}
	
	public String getEmail() {
		return emailId;
	}
	public void setEmail(String email) {
		this.emailId = email;
	}
	
	public float getAmount() {
		return amount;
	}
	public void setAmout(float amount) {
		this.amount = amount;
	}

}
