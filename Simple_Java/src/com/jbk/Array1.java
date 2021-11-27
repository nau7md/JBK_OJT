package com.jbk;

public class Array1 {
	public static void main(String[] args) {
		// inialize array by two ways 1.Static initialization 2. Dynamic inialization

		// Static Initialization
		int[] a = { 23, 45, 22, 59, 45, 89 };
		// dynamic inialization
		int[] arr = new int[5];

		int[] array;
		array = new int[4];
		array[0] = 12;
		array[1] = 23;
		array[2] = 25;
		array[3] = 37;
		//array[4] = 44;
		for (int res : array) {
			System.out.println(res);
		}

	}

}
