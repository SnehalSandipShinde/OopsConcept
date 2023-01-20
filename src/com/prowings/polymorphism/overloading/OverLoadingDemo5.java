package com.prowings.polymorphism.overloading;

public class OverLoadingDemo5 {
	
	public static void main(String[] args) {
		OverLoadingDemo5 obj = new OverLoadingDemo5();
		testMethod(1);
//		testMethod("Pune");
		obj.testMethod("Pune");
		testMethod(1,"Pune");
		testMethod(2,3);
	}

	public static void testMethod(int number) {
		System.out.println("Number");
	}
	
	public String testMethod(String str) {
		System.out.println("String");
		return str;
	}
	public static void testMethod(Integer number) {
		System.out.println("Integer number");
	}
	
	public static void testMethod(int number , String str) {
		System.out.println("number , String");
	}
	public static void testMethod(String str, int number) {
		System.out.println("number , String");
	}
//	public static void testMethod(int i , long j) {
//		System.out.println("int and long");
//	}
	public static void testMethod(long i , int j) {
		System.out.println("long and int");
	}
	

}
