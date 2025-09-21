package com.tnsif.dayeight.abstractdemo;

public class Rectangular extends shape{
	float width;
	float height;
	
     // public void calArea() {
    	  
//    	  public Rectangular() {
//    			super();
//    			width = 23f;
//    			height = 45f;
//    		}
    //  }
	public Rectangular(float width, float height) {
		
		this.width = width;
		this.height = height;
	} 
	 public void calArea() {
		 this.area=width*height;
	 }
      
}
