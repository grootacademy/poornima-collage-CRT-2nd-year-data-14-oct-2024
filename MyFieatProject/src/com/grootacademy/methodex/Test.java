package com.grootacademy.methodex;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		MyUtils myUtils = new MyUtils();
//		myUtils.saySomethig();
//		myUtils.getFact();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first Number  :: ");
//		int x = sc.nextInt();
//		System.out.println("Enter second number :: ");
//		int y = sc.nextInt();
//		myUtils.sum(x, y);
		System.out.println(myUtils.OddEvne());
	}
}

class MyUtils {
	Scanner sc = new Scanner(System.in);

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition =" + c);

	}

	public String OddEvne() {
		System.out.println("Enter a number to check Odd and even");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			return "Number is even";
		}
		return "Number is ood";
//		return null;
	}

	public void saySomethig() {
		System.out.println("Hello");
	}

	public void getFact() {

		System.out.println("Enter a number :: ");
		int num = sc.nextInt();
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial =" + fact);
	}

}