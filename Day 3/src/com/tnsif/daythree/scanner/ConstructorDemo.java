package com.tnsif.daythree.scanner;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("Enter customer id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter customer name: ");
		name=sc.nextLine();
		System.out.println("Enter customer city: ");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		Constructor c2=new Constructor("Aditya", 1001,"Mumbai");  //default
		System.out.println(c2);
		}

}
