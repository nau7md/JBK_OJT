package com.jbk;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Java_String {
	public static void main(String[] args) {
		char choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st string");
			String st = sc.next();
			System.out.println("Enter 2nd string");
			String st1 = sc.next();
			char ch = st.charAt(3);
			System.out.println(ch);

			IntStream stream = st.chars();
			System.out.println(stream);

			int i = st.codePointAt(1);
			System.out.println(i);

			int ct = st.compareTo(st1);
			System.out.println(ct);
			
			System.out.println(st1.compareToIgnoreCase(st));
			
			
			Boolean b=st.equals(st1);
			System.out.println(b);
			
			String str= st.concat(st1);
			System.out.println(str);
			
			
		   System.out.println(st.length());	
			
			

			System.out.println("do you want to continue y/n ?");
			choice = sc.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

	}
}
