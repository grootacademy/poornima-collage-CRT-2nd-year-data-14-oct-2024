package com.groot.abc;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student st = new Student();
		System.out.println("Before initialzastion  ::");
		
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.fee);
		System.out.println("Enter id=");
//		int id=-sc.nextInt();
		st.id = sc.nextInt();
		System.out.println("Enter Name =");
		st.name = sc.next();
		System.out.println("Enter Fee=");
		st.fee = sc.nextFloat();
		System.out.println("After initialzation  :");
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.fee);
	}
}

class Student {
	int id;
	String name;
	float fee;
}
