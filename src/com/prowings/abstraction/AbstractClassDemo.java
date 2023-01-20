package com.prowings.abstraction;

public abstract class AbstractClassDemo {
	int i;
	int j;
	String s1;
	String s2;
	public static void main(String[] args) {
		//AbstractClassDemo acd = new AbstractClassDemo();
	}
	AbstractClassDemo()
	{
		super();
		System.out.println("No arg Constructor of parent invoked!!");		
	}
	AbstractClassDemo(int i , int j , String s1, String s2)
	{
		this.i=i;
		this.j=j;
		this.s1=s1;
		this.s2=s2;
		System.out.println("All arg constructor of parent invoked!!");
	}
	public void print() // concrete method
	{
		System.out.println("Inside print method");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.s1);
		System.out.println(this.s2);
	}
	public abstract void show();//abstract method
	
	/*
	 * public static void main() {
	 * 
	 * }
	 */

}
