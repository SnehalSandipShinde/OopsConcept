package com.prowings.polymorphism.overloading;

public class DiffReturnType {
	
	public DiffReturnType()
	{
		System.out.println("Constructor");
	}

	void DiffReturnType()
	{
		System.out.println("Method");
	}
	
	String hello() 
	{
		return "hello";
	}
//	int hello() //Duplicate method hello() 
//	{
//		return 12;
//	}
	
	int hello1() 
	{
		return 12;
	}
	
	public static void main(String[] args) {
		DiffReturnType dr = new DiffReturnType();
		
		dr.DiffReturnType();
		System.out.println(dr.hello());
		System.out.println(dr.hello1());
	}
}
