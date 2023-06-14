package com.prowings.polymorphism.overloading;

public class NullTest {

	public static void m1() {
		System.out.println("Inside test - m1()");
	}
	
	public void m1(int i) {
		System.out.println("Inside test - m1()");
	}
	public static void main(String[] args) 
	{
		NullTest t = null;
	
		t.m1();//static method can load at the time of class loading
		
		t.m1(1);//it will throw the NullPointerException
	}
}
