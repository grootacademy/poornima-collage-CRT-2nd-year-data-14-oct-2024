package com.groot.firsday;

import java.util.Scanner;

public class StrnigComp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entry Your country name");
		String countryName = sc.next();
		if (countryName.equalsIgnoreCase("india")) {
			System.out.println("Enter your age :");
			int age = sc.nextInt();
			if (age >= 18) {
				System.out.println("Welcome for voting");
			} else {
				System.out.println("Invalid age");
			}
		} else {
			System.out.println("Sahi jagah janm lete");
		}
	}
}
