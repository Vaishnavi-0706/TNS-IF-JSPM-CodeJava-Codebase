package com.tnsif.day6.usingfinal;

public class FinalVariable {
     //final int x ;  final should be initialixa
	final int x=100;
	//declare a static blank final variable
	final static int y;
	
	final static int z=10;
	
	//instance method
	void change() {
		//x=300;
		//z=100;
		//y=43;
		
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y=" +y+"]";
		//declare a static block
		
	}
	//declare static block
	static{
		//z=34;
		y=32;
		System.out.println("Value of y: "+y);
	}

	
}
