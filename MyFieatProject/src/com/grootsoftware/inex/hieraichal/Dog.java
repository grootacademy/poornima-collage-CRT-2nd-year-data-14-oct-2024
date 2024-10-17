package com.grootsoftware.inex.hieraichal;

public class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barkig");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating bread");
	}
}
