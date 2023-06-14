package com.prowings.inheritance;

class TestA
{
	
	public void get()
	{
		System.out.println("In A");
	}
	
	public int get(int i)
	{
		System.out.println("In A int");
		
		return i;
	}
}

class B extends A
{
	private void get()
	{
		System.out.println("In B");
	}
	
	public int get(int j)
	{
		System.out.println("In B int");
		
		return j;
	}
}
public class InterviewScenario2 {

	
	public static void main(String[] args) 
	{
		B b = new B();
//		b.get();//The method get() from the type B is not visible (private method)
		
	}
}