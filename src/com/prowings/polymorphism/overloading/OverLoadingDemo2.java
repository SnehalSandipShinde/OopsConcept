package com.prowings.polymorphism.overloading;

public class OverLoadingDemo2 {
	
	
//	public void method1(int i) {
//		System.out.println("method1(int i)");
//	}
	
//	public void method1(long i) {
//		System.out.println("method1(long i)");
//	}
	
//	public void method1(Integer i) {
//		System.out.println("method1(Integer i)");
//	}
	
	public void method1(Number i) {
		System.out.println("method1(Number i)");
	}
	
	public void method1(Long i) {
		System.out.println("method1(Long i)");
	}
	
	public static void main(String[] args) {
		OverLoadingDemo2 obj = new OverLoadingDemo2();
//		int x = 10;
//		short x = 20;
		Integer x = 30;
		obj.method1(x);
	}

}
