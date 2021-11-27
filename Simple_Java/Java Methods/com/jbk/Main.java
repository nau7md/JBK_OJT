package com.jbk;

public class Main {
	public static void main(String[] args) {
		
		// create object of class MyMethod
		MyMethod obj=new MyMethod();
		obj.m1(); // you can call method multiple times...
		obj.m1();
		
		obj.m2(10, 5);
	
		
		/*int res=obj.m3(43);
		System.out.println(res);*/
		
		System.out.println(obj.m3());
		
		
		int z=obj.m4(23, 33);
		System.out.println(z); // return 56 (23+33)
		
		
	}
	    

}
