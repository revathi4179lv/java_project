package com.overriding;

public class customer extends shop {
//override concept
	@Override
	public void shopName(String name) {
		super.shopName(name);
	}
	@Override
	public void shopAddress(String address) {
		super.shopAddress(address);
	}
	@Override
	public void shopNumber(long number) {
		super.shopNumber(number);
	}
	//main function
	public static void main(String[] args) {
		//object creation
		customer c = new customer();
		c.shopName("ABC SHOP");
		c.shopAddress("1, gandhi street, chennai");
		c.shopNumber(9876543210L);
	}
}
