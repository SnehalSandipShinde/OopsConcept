package com.prowings.abstraction.marks;

public class DisplayMarks {
	public static void main(String[] args) {
		StudentA s1 = new StudentA();
		StudentB s2 = new StudentB();
		
		s1.totalPercentage(86, 79, 67);
		s2.totalPercentage(87, 79, 57, 83);
		
		System.out.println("Student A can get "+ s1.getPercentage() +"% Percentage");
		System.out.println("Student B can get "+ s2.getPercentage() +"% Percentage");
	}

}
