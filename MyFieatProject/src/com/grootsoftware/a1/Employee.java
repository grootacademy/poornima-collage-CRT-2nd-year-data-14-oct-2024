package com.grootsoftware.a1;

public class Employee {
	int id;
	String name;
	float salary;
	Address address;
	public Employee(int id, String name, float salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public void printDatetils() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		address.printData();
	}
}
