package com.prowings.polymorphism.overloading;

public class InterviewScinario {

	public void method(Long i) {
		System.out.println("Long");
	}
	
//	public void method(Integer i) {
//		System.out.println("Integer");
//	}
	
	public void method(long i) {
		System.out.println("long");
	}
	
	
	public static void main(String[] args) 
	{
		
		Integer j = 10;
		
		InterviewScinario is = new InterviewScinario();
		is.method(j); //not convert Integer to Long (it's siblings)
	}
}
