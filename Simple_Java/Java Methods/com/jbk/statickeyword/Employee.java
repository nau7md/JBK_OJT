package com.jbk.statickeyword;

public class Employee {
	int id;
	String name;
	static String company="HMT"; // static variable used for memory management and efficient

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
		
	}

	void display() {
		System.out.println("Id:" + id +" Name:" +name + " Company:" + company);

	}
}

class Test {
	public static void main(String[] args) {
		// creat object of class Employee
		Employee e1 = new Employee(101, "Amit");
		Employee e2 = new Employee(102, "Sura");
		Employee e3 = new Employee(103, "Shah");
		
		e1.display();
		e2.display();
		e3.display();



	}

}
