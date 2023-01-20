package com.prowings.polymorphism.overloading;

public class OverLoadingDemo3 {
	
	public void m1(Object o) {
		System.out.println("Object");
	}
	
//	public void m1(Number n) {
//		System.out.println("Number");
//	}
	
//	public void m1(Integer i) {
//		System.out.println("Integer");
//	}
	
	public void m1(Long l) {
		System.out.println("Long");
	}
	public static void main(String[] args) {
		OverLoadingDemo3 obj = new OverLoadingDemo3();
		obj.m1(10);
	}

}
