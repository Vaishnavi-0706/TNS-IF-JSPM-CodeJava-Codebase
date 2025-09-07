package com.tnsif.daythree.scanner;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		// Scanner class
		
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter Person name: ");
		String name=ob.nextLine();
		System.out.println("Enter Income: ");
		int income=ob.nextInt();
		System.out.println("Enter Age: ");
		int age=ob.nextInt();
		System.out.println("Enter Gender: ");
		String gender=ob.next();
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person.getAge());
		
		System.out.println(person);
		
		System.out.println("After tax: ");
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println(person);
		
		
		
		

	}

}
