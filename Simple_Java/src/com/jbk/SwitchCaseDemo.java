package com.jbk;

public class SwitchCaseDemo {
	public static void main(String[] args) {

		int day = 3;
		switch (day) {
		case 1:
			System.out.println("day is Monday");
			break;
		case 2:
			System.out.println("day is Tuesday");
			break;

		case 3:
			System.out.println("Day is wednesday");
		default: 
			System.out.println("This is default case");
		}
	}

}
