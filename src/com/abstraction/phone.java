package com.abstraction;
//abstract class
public abstract class phone {
	public abstract void imeiNum();//abstract method
	public abstract void amount();
	//non abstract method
	public void modelName() {
		System.out.println("IPHONE");
	}
	public void phoneColour(String colour) {
		System.out.println(colour);
	}
	public void phonesize() {
		System.out.println("64GB");
	}
	

}
