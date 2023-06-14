package com.prowings.polymorphism.overloading;

public class ArrayVarArg {
	
	public static void test(int[] i)
	{
		System.out.println("int array");
	}
	
	public static void test(long[] i)
	{
		System.out.println("long array");
	}
	
	public static void test(char[] ch)
	{
		System.out.println("Charachter array");
	}

	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		test(nums);
		
//		test(null);//The method test(int[]) is ambiguous for the type ArrayVarArg
	}
}
