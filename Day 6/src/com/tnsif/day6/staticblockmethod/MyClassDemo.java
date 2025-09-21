package com.tnsif.day6.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass.display();
		 System.out.println();
		 MyClass o1 = new MyClass();
		 System.out.println(o1);
		 //static method with class name
		 MyClass.display();
		 System.out.println();
		 MyClass o2= new MyClass();
		 System.out.println(o2);
	}

}
