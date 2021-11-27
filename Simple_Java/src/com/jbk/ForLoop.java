package com.jbk;

public class ForLoop {
	public static void main(String[] args) {

		int[] arr = { 12, 13, 22, 12, 84 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			

		}
		System.out.println("Size of array:"+arr.length);
		int hascode=arr.hashCode();
		System.out.println(hascode);
		
		
		System.out.println("*************************");
		  for(int ar:arr) {
			  System.out.println(ar);
		  }
		  
		  
		  for(int i=1;i<=5;i++) {
			  System.out.println("yes");
			  
		  }
	}

}
