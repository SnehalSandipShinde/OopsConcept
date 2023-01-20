package com.prowings.hasarelation;

public class Student {
	String name;
	int rollNo;
	Address address;

	Student(String nm, int rn, Address ad) {
		this.name = nm;
		this.rollNo = rn;
		this.address = ad;
	}

//	public int getRollNo() {
//		return rollNo;
//	}

	public String getName() {
		return name;
	}

	public Address getAdd() {
		return address;
	}

	public static void main(String[] args) {
		Address addr = new Address(123, "Pune");
		Student std = new Student("shidne", 12, addr);
		System.out.println(std.name);
		System.out.println(std.rollNo);
		System.out.println(addr.city);
		System.out.println(addr.pinCode);
	}

}
