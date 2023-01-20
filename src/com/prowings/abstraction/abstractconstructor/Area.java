package com.prowings.abstraction.abstractconstructor;

public class Area extends Shape {
	
	public static void main(String[] args) {
		Shape objs = new Area();
		Area obj = new Area();
		obj.formulaOfRectangle(8, 6);
		obj.rectangleArea();
//		System.out.println("Area Of rectangle = "+objs.rectangleArea());
		
		obj.formulaOfSquare(12);
		System.out.println("Area of Square = "+ objs.squareArea());
		
		obj.formulaOfCircle(4);
		System.out.println("Area of Circle = "+obj.areac);
		//obj.circleArea();
	}
//	private float l;
//	private float b;
	private float arear; 
	public void formulaOfRectangle(int l , int b) {
		arear = l * b;
	}
	
	private float areas;
	public void formulaOfSquare(int a) {
		areas = a * a;
	}
	
	private float areac;
	public void formulaOfCircle(int r) {
		areac = (float) (r * r * 3.14);
	}
	
	

	@Override
	public float rectangleArea() {
		System.out.println(arear);
		return arear;
	}
	

	@Override
	public float squareArea() {
		return areas;
	}

	@Override
	public float circleArea() {
		return areac;
	}

}
