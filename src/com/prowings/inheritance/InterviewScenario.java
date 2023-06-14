package com.prowings.inheritance;

class A
{
	
	public static void m1()
	{
		System.out.println("In A - m1()");
	}
}
public class InterviewScenario extends A{

	public static void m1()
	{
		System.out.println("In InterviewScenario - m1");
	}
	
	public static void m2()
	{
		System.out.println("In InterviewScenario - m2");
	}
	
	public static void main(String[] args) 
	{
		
		A obj = new InterviewScenario();
		
//		obj.m2();
		//we can hold the obj of child in reference of parent but we cannot access the parent method 
		
	}
}