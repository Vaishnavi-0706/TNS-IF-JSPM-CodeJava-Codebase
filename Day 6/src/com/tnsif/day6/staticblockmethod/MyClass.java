package com.tnsif.day6.staticblockmethod;

public class MyClass {
       private int section;
       private static int srNo;
       static{
    	   System.out.println("---Within static block---");
    	   srNo=1000;
    			   }
       MyClass(){
    	   System.out.println("---within default constructor---");
    	   srNo++;
    	   section++;
       }
       //to string
	   @Override
	   public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	   }
	   //static method
	   static void display() {
		  // System.out.println("Section: "+section);
		   System.out.println("Serial no: "+srNo);
	   }
}

