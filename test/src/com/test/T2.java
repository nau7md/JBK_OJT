package com.test;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T2 {
	public static void main(String[] args) throws IOException {

		DataInputStream di = new DataInputStream(System.in);

		FileOutputStream fo = new FileOutputStream("G:/abc.txt");
		System.out.println("Enter text");
		char ch;
		while ((ch = (char) di.read()) != '#')
			// di.read();
			fo.write(ch);
		fo.close();

	}

}
