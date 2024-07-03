package com.prowings.abstraction;

public class Employee extends Person {

	public Employee() {
		System.out.println("Inside the no arg Constructor of child");
	}

	private Integer empId;

	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId = id;
	}

	@Override
	public void work() {

		if (empId == null)
			System.out.println("Person is not existing...");
		else if (empId == 0) {
			System.out.println("Not Working");
		} else {
			System.out.println("Working as a employee");
		}
	}

	public static void main(String[] args) {
		// Person student = new Employee();
		Employee student1 = new Employee();
		Person employee = new Employee("Vijay", "Male", 06);
		student1.work();
		employee.work();
		System.out.println(student1.toString());

		System.out.println(employee.toString());
		employee.changeName("Vijay Ghatage");
		System.out.println(employee.toString());
	}
}
