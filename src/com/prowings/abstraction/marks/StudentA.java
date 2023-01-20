package com.prowings.abstraction.marks;

public class StudentA extends Marks{
	private float mark;
	private int total ;
	public void totalPercentage(int marathi, int hindi, int english) {
		total = marathi + hindi + english;
		mark = total/3;
		
	}
	public float getPercentage() {
		return mark;
	}

}
