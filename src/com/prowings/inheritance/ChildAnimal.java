package com.prowings.inheritance;

public class ChildAnimal extends ParentClass{
	private void cat() {
		System.out.println("it sounds meawwooo...");
	}
	public static void main(String[] args) {
		ParentClass pc = new ChildAnimal();
		pc.animal();
		
		ChildAnimal ca = (ChildAnimal) new ParentClass();
		ca.cat();
		
	}
}
