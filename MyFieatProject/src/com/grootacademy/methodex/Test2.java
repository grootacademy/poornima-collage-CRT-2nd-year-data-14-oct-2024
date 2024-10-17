package com.grootacademy.methodex;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		Student st=new Student(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		int id=sc.nextInt();
		Student st=new Student(id,"Jai",3333);
		st.printDetails();
	} 
}

class Student {
	int id;
	String name;
	float fee;
	public Student(int id,String name,float fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(fee);
	}
}