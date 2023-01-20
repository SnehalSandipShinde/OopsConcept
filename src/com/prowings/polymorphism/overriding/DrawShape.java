package com.prowings.polymorphism.overriding;

public class DrawShape {
	
	public static void main(String[] args) {
		
		Shape s = null;
		s.draw();
		s.fill();
		
		Circle c = new Circle();
		c.draw();
		c.fill();
		
	}
	
}
