package com.prowings.polymorphism.overloading;

public class OverLoadingDemo4 {
	
	public static void m1(Long l) {
		System.out.println("Long");
	}
	public static void m1(String a,Long ... n) {
		System.out.println("Var-arg()");
		System.out.println();
	}
//	public static void m1(Number n) {
//		System.out.println("Number");
//	}
//	public static void m1(Object o) {
//		System.out.println("Object");
//	}
	public static void m1(String o) {
		System.out.println("String");
	}
	public static void main(String[] args) {
//		OverLoadingDemo4 obj = new OverLoadingDemo4();
		Long i = 20l;
		m1(i);
//		int j = 21;
//		m1(j);
		m1("Hi", 30l, 201l);
		
	}

}
