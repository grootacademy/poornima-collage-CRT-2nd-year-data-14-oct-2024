package com.groot.assosiation;

public class Person {
	int uid;
	String name;
	Address address;

	public Person(int uid, String name, Address address) {
		this.uid = uid;
		this.name = name;
		this.address = address;
	}

	public void printDetials() {
		System.out.println(uid);
		System.out.println(name);
		address.printDetials();
	}
}
