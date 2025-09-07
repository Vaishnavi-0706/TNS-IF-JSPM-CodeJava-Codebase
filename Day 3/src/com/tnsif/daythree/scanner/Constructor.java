package com.tnsif.daythree.scanner;

public class Constructor {
	
	private String customername;
	private int customerid;
	private String customercity;

	
	//default Constructor
	public Constructor() {
		System.out.println("Defaut Constructor");
	}
	
	//parametric constructor
	public Constructor (String customername, int customerid, String customercity) {
		super();
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
	}

	@Override
	public String toString() {
		return "Constructor [customername=" + customername + ", customerid=" + customerid + ", customercity="
				+ customercity + "]";
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

//	public static void main(String[] args) {
//	}

}
