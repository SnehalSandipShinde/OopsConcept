package com.prowings.abstraction.marks;

public class StudentB extends Marks{
	private float mark;
	private int total;
	 
	public void totalPercentage(int marathi, int hindi, int english, int history) {
		total = marathi + hindi + english + history;
		mark = total/4;
		
	}

	@Override
	public float getPercentage() {
		return mark;
	}

}
