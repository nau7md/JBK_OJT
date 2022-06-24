package com.test;

public class Test {

	public int getValue(int arr[]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println("learn debugging");
		Test t = new Test();
		int num[] = { 3, 5, 3, 4 };

		System.out.println("Sum:"+t.getValue(num));

	}
}
