package com.jbk;

public class MyMethod {
	int x,y; //instance variable

	public void m1() { // void does not return anything

		System.out.println("Method m1 is called");
	}

	public void m2(int x, int y) {
		int z = x + y;
		System.out.println("Addition of x and y:" + z);

	}

	public int m3() {

		return 102;

	}
	
	public int m4(int x,int y) { // Here int x,int y is local variables
		
		this.x=x;
		this.y=y;
		
		return x+y;
	}
	
	

}
