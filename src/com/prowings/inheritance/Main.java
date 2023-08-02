package com.prowings.inheritance;

public class Main {
	
	public static void main(String[] args) {
		Aa a = new Bb();
		a.m1();
//		a.m2();
	}

}

class Aa
{

	public void m1() {
		
	}

	
	
}
class Bb extends Aa 
{
	public void m2() {
		
	}
}
