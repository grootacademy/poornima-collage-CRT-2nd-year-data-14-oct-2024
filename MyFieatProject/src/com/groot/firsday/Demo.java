package com.groot.firsday;
import java.util.Scanner;
public class Demo {
		public static void main(String args[]) {
//			System.out.println("Hello Java");
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter value of a:::");
			int a=sc.nextInt();
			System.out.println("Enter value of b:: ");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Addition ="+c);
		}
}
