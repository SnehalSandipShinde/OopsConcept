package com.prowings.abstraction;

public abstract class Person {
	private String name;
	private String gender;
	
	public Person() {
		System.out.println("Inside Person Contrustor of parent invoked!!");
	}
	public Person(String nm , String gen)
	{
		System.out.println("Inside all arg constructor of parent invoked!!");
		this.name = nm;
		this.gender = gen;
	}
	public abstract void work();//abstract method
	
	
@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	//	public String toString() {
//		return "Name :" + this.name +" \nGender :"+ this.gender;
//		
//	}
	public void changeName(String changednm) {
		this.name=changednm;
	}

}
