package com.groot.assosiation;

public class Test {
	public static void main(String[] args) {
		Address a1=new Address("199-22", "Pratap nagar", "Jaipur", "33444");
		Person  person=new Person(2323, "jai", a1);
		person.printDetials();
	}
}
