package com.prowings.polymorphism.overloading;

import com.prowings.inheritance.Bar;

public class VarArgDemo extends Bar 
{

	public void test(int i) 
	{
		System.out.println("int");
	}

	public void test(int... i) 
	{
		System.out.println("int var-arg");
	}

	public void test(char... i)
	{
		System.out.println("char var-arg");
	}

	public static void main(String[] args) 
	{

		VarArgDemo vr = new VarArgDemo();
//		vr.test(2);
		vr.test('a');
		vr.test(10, 20, 30);
		vr.test('a', 'e', 'i', 'o', 'u');
		vr.test('s', 'w', 23);
	}

}
