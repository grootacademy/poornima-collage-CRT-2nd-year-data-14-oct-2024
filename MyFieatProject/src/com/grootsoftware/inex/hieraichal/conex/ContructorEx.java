package com.grootsoftware.inex.hieraichal.conex;

public class ContructorEx {
	public static void main(String[] args) {
		new Dog();
	}
}
class Animal{
	public Animal(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor with args from parent");
	}
}
class Dog extends Animal{
	Dog(){
		System.out.println("in the child class construtor");
		super(10);
	} 
}