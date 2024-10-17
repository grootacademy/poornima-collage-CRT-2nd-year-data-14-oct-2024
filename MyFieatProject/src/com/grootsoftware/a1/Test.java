package com.grootsoftware.a1;

public class Test {
	public static void main(String[] args) {
		Address a1 = new Address("89", "Mansarovar", "Jaqipur", "302020");
		Employee e1=new Employee(01, "jai", 8848, a1);
		e1.printDatetils();
	}
}
