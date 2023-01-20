package com.prowings.polymorphism.overriding;

public class OverridingDemoArray {
	
	public static void test(int[] intArr) {
		System.out.println("int array");
	}
	
	private static char test(char[] charArr) {
		System.out.println("char array");
		return 0;
	}
	
	public static void main(String[] args) {
//		test(null);
		int[] arr = {10,29};
		test(arr);
		char[] arraC= {'a','e'};
		test(arraC);
	}

}
