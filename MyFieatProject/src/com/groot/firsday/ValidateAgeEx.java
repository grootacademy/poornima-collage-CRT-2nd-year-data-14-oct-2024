package com.groot.firsday;

import java.util.Scanner;

public class ValidateAgeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age===");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Welcome for Voring");
		} else {
			System.out.println("Invalid age");
		}
	}
}
