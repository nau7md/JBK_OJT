package com.jbk.calculation;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {

		char ch;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			System.out.println("Enter your choice");

			int x = 100, y = 77;

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				int addition = x + y;
				System.out.println("Additioin:" + addition);

				break;
			case 2:
				int sub = x - y;
				System.out.println("Subtraction" + sub);

			case 3:
				int mul = x * y;
				System.out.println("Multiplication:" + mul);
				break;
			case 4:
				int division = x / y;
				System.out.println("Division:" + division);
				break;

			case 5:
				int mod = x % y;
				System.out.println("Modulus:" + mod);
				break;
			default:
				System.out.println("Not Valid");

			}
			System.out.println("Do you want to continue y/n ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
