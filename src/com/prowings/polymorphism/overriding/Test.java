package com.prowings.polymorphism.overriding;


class A
{
	public void accelerate()
	{
		System.out.println("in A");
	}
}
public class Test extends A{
	
	
	public Test() {
		super();
	}
	public void accelerate()
	{
		System.out.println("in Test");
		
	}
	public void accelerate(int speeLimit)
	{

		System.out.println("in Test with param");
	}

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accelerate();
		
		A a = new Test();
		a.accelerate();
		
		A ab = new A();
		ab.accelerate();
		
		Test tt = new Test();
		tt.accelerate(12);
		
		A at = new Test();
		at.accelerate();
	}
}
