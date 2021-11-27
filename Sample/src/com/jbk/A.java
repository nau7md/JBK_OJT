package com.jbk;

import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		int[] numbers = new int[101];
		for (int i = 0; i <= 100; i++) {
			numbers[i] = i;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scanner.nextInt();
		for (int i = num; i <numbers.length; i = i + 10) {

			if(numbers[i]%i==0) {
				System.out.println(numbers[i]);
			}

		}

	}

}
