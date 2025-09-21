package com.tnsif.dayeight.abstractdemo;

public class ShapeDemoMain {
      public static void main(String[] args) {
    	  shape s;
    	  
    	  s=new Square(5.3f);
    	  s.calArea();
    	  s.show();
    	  
    	  s=new Rectangular(5.3f, 4.3f);
    	  s.calArea();
    	  s.show();
      }
}
