package com.grootsoftware.inex.multipleex;

public class Test {
	public static void main(String[] args) {
		C c=new C();
		c.say();
	}
}
class A{
	public void say() {
		System.out.println("Say From A");
	}
}
class B{
	public void say() {
		System.out.println("Say From B");
	}
}
class C extends A,B{
	
}