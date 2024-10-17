package com.grootsoftware.inex;

public class Test {
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.eat();
//		d.bark();
//		System.out.println(d.color);
//		System.out.println(d.speed);
		BabayDog b=new BabayDog();
		b.eat();
		b.bark();
		b.cry();
	} 
}

class Animal {
	String color = "black";

	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	int speed = 40;

	public void bark() {
		System.out.println("Kuta bhonk rha hai");
	}
}

class BabayDog extends Dog{
	public void cry() {
		System.out.println("Baby dog is crying");
	}
}