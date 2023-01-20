package com.prowings.inheritance;

class Foo {
	Foo() {
		m1();
	}
	
	void m1() {
		System.out.println("Foo");
	}
}

public class Bar extends Foo {
	Integer x = 5;
	void m1() {
		System.out.println("x= "+x);
	}
	public static void main(String[] args) {
//		Foo f = new Foo();
		Foo f = new Bar();
//		Bar f = new Bar();
		f.m1();
		
//		System.out.println(f instanceof Bar);

	}
}
