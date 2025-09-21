package com.tnsif.dayeight.abstractdemo;

public class Square extends shape{
        float side;
        
        public Square(float side) {
        	this.side = side;
        }
        public void calArea() {
   		 this.area=side*side;
   	 }
}
