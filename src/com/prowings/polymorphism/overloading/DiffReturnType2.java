package com.prowings.polymorphism.overloading;

public class DiffReturnType2 {
	
	
	int m1(int a,int b) {
		return a+b;
	}
	
//	void m1(int a, int b) {
//		duplicate method
//	}
//	
//	public static void main(String ... args) {
//		it is nothing but var-arg method of string array
//		which is simillar to main method...
//	}
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		DiffReturnType2 df2 = new DiffReturnType2();
		
		df2.m1(a, b);
	}
	
	
}
