package com.jbk;

import java.util.ArrayList;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<Comparable> arl = new ArrayList<Comparable>();
		arl.add(23);
		arl.add("All");
		arl.add(4);
		arl.add("A");
		arl.add(null);

		System.out.println(arl); // 23,All,4,A,null

		arl.remove(4);
		System.out.println(arl); // 23,All,4,A
            arl.add(4,45);
		System.out.println(arl);
	}

}
