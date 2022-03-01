package com.revathiclass;

public class variables {
	int c=40, d=20; 	
	public void addition() {
		int a=10, b=20;
		System.out.println("Local Variable");
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);		
		System.out.println("addition :"+(a+b));
		
		
	}
	
	public void sub() {
		System.out.println("Class Variable");
		System.out.println("subtraction:" +(c-d));
}
	public static void main(String[] args) {
		variables var=new variables();
		var.addition();
		System.out.println("c value is :"+var.c);
		System.out.println("d value is :"+var.d);
		var.sub();
	
	}
}
