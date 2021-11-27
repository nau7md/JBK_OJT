package com.jbk;

public class Array {
	public static void main(String[] args) {
		String[] cars = null;
		cars = new String[3];
		cars[0] = "Valvo";
		cars[1] = "Tata";
		cars[2] = "Maruti";
		 System.out.println("Hello");
		try {
			cars[3] = "Nano";
			cars[4] = "Hyundai";
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		for (String car : cars) {
			System.out.println(car);
	}

}
}
