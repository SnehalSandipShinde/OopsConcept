package com.prowings.abstraction;

public class AbstractDemoImpl extends AbstractClassDemo {

	AbstractDemoImpl() {
		System.out.println("Inside no arg constructor of child class");
	}

	AbstractDemoImpl(int i, int j, String s1, String s2) {
		super(i, j, s1, s2);
		System.out.println("Inside all arg constructor of child");
	}

	@Override
	public void show() //abstract method of parent class
	{
		System.out.println("Insode Show Method");

	}

	public static void main(String[] args) {
		// AbstractClassDemo obj1 = new AbstractClassDemo();//cannot create object
		AbstractClassDemo obj = new AbstractDemoImpl(10, 20, "hello", "Hi!!");
		obj.show();
		obj.print();

		AbstractDemoImpl obj1 = new AbstractDemoImpl();
		obj1.show();

	}

}
