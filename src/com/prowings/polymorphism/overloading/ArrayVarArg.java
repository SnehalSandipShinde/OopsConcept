package com.prowings.polymorphism.overloading;

public class ArrayVarArg {
	
	public void test(Integer ...i )
	{
		System.out.println("Integer array");
	}
	
//	public void test(int ... i)
//	{
//		System.out.println("int array");
//	}
	
//	public void test(long ... i)//it creates ambigues situation with Integer method
//	{
//		System.out.println("long array");
//	}
	
	public void test(char[]... ch)
	{
		System.out.println("Charachter array");
	}

	
	public static void main(String[] args) {
		
		char[] ch = {'a','b','c'};
		
		int[] arr = {12,21,32};
		
		ArrayVarArg av= new ArrayVarArg();
		av.test(ch);
		
//		av.test(arr);
		
		av.test(12,23,45);
	}
}
