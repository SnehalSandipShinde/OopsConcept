package com.prowings.polymorphism.overloading;

public class OverLoadingDemo1 {
	
	public void add(int i , long j) {
		//int res = i + j;
//		System.out.println(res);
		System.out.println("Inside add method with two arguments");
	}
	
	public void add(int i , int j, int k) {
		int res = i + j + k;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		OverLoadingDemo1 obj = new OverLoadingDemo1();
		obj.add(23, 22, 22);
	}

}
