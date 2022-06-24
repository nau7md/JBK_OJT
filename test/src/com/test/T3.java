package com.test;

import java.io.FileInputStream;
import java.io.IOException;

public class T3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("G:/abc.txt");
		System.out.println("file contents");
		int ch;
		while ((ch = fis.read()) != -1) {
			System.out.println((char)ch);
			fis.close();
		}
	}

}
