package com.simpleprogram;

public class OopsExample {
	//method
	public void vehicleName() {
		System.out.println("bike");
	}
	
	public void vehicleNumber() {
		System.out.println("TN21 AZ 7799");
	} 
	
	public void vehicleCompanyName() {
		System.out.println("honda");

	}
	//main method
	public static void main(String[] args) {
		//object creation
		OopsExample o=new OopsExample();
		//method calling
		o.vehicleName();
		o.vehicleNumber();
		o.vehicleCompanyName();
	}
	
}
