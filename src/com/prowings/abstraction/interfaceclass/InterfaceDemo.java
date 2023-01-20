package com.prowings.abstraction.interfaceclass;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		onesMethod();
		
		twosMethod();
		
		threesMethod();
		
	}

	public static void threesMethod() {
		Three three = new Three();
		three.methodOne();
		three.methodTwo();
		three.methodThree();
	}

	public static void onesMethod() {
		One one = new One();
		one.methodOne();
		one.methodTwo();
		one.methodThree();
	}

	public static void twosMethod() {
		Two two = new Two();
		two.methodOne();
		two.methodTwo();
		two.methodThree();
	}

}
