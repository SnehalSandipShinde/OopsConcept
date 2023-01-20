package com.prowings.abstraction.abstractconstructor;

public class SubClassOfAC extends AbstractConstructor{

	@Override
	public void methodAbstract() {
		System.out.println("This is inside of abstract method of abstract Class");
		
	}
	public static void main(String[] args) {
//		AbstractConstructor obj = new AbstractConstructor(); // cannot instanciate the abstract method
		SubClassOfAC obj = new SubClassOfAC();
		obj.methodAbstract();
		obj.methodNormalAbstract();
		
	}
	

}
