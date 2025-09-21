package com.tnsif.day6.usingfinal;

public class FinalMethodClass {
	
	public FinalMethodClass() {
System.out.println("This is default constructor");

	}
  final int a=45;
  
  //final method
  final void show() {
	  System.out.println("Value of a: "+a);
  }
}
