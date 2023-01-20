package com.prowings.polymorphism.overloading;

public class OverLoadingDemo6 {
	
	
	public static void main(String[] args) 
	{
		m1(12, 23);
	}
	
	
//	public static int m1(int i, int j) 
	//{
//		return 1;
//	}// it could be a duplicate method
	
	
	
	public static long m1(int i, int j) 
	{
		System.out.println(i+j);
		return 0l;
	}

	
	
	

}
