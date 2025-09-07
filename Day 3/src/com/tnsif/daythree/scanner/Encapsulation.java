package com.tnsif.daythree.scanner;

public class Encapsulation {


		// data member 
        private int serialNum;
        private String name;
        private int age;
        
        //setter / para constructor
        //to string - get read / getter
        
        public int getSerialNum() {
    		return serialNum;
    	}
    	public void setSerialNum(int serialNum) {
    		this.serialNum = serialNum;
    	}
    	public String getName() {
    		return name;
    	}
    	public void setName(String name) {
    		this.name = name;
    	}
    	public int getAge() {
    		return age;
    	}
    	public void setAge(int age) {
    		this.age = age;
    	}
    	
    	//object class method - to return string representation of the object 
    	@Override
    	public String toString() {
    		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
        
	}

}
