package com.overriding;

public class visitingCard extends shop {
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
//main 
public static void main(String[] args) {
	//object creation
	visitingCard v=new visitingCard();
	v.shopName("ABC SHOP");
	v.shopAddress("1, gandhi street, chennai");
	v.shopNumber(9876543210L);
}

}
