package com.tnsif.dayeight.abstractdemo;

public abstract class shape {
      protected float area;
      public abstract void calArea() ;
      
      public void show() {
    	  System.out.println("Area of the shape: "+area);
      }
}
