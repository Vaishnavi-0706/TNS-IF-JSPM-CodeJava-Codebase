package com.tnsif.daythree.scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Encapsulation obj = new  Encapsulation();
		 obj.setAge(34);
			obj.setName("Vaishnavi");
			obj.setSerialNum(12345);
			
			System.out.println(obj.getName());
			System.out.println(obj.getAge());
			System.out.println(obj.getSerialNum());
			
			System.out.println(obj);
	}

}
