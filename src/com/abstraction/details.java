package com.abstraction;

public class details extends phone {
@Override 
public void imeiNum() {
	System.out.println("355679008765434");
}
@Override
	public void amount() {
		System.out.println("100000");		
	}
//main method
public static void main(String[] args) {
	//object creation
	details d = new details();
	//method calling
	d.modelName();
	d.imeiNum();
	d.phonesize();
	d.phoneColour("silver");
	d.amount();
}
}
