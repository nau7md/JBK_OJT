package com.jbk.statickeyword;

public class StaticKeyExample {
	static int x = 10;
}

class Test1 {
	public static void main(String[] args) {
		System.out.println(StaticKeyExample.x);
	}
}
