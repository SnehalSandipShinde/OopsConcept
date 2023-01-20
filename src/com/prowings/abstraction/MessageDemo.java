package com.prowings.abstraction;

public class MessageDemo extends SecondSubclass{
	
	public static void main(String[] args) {
		FirstSubclass fs = new FirstSubclass();
		fs.message();
		
		SecondSubclass ss = new MessageDemo();
		ss.message();
	}

}
