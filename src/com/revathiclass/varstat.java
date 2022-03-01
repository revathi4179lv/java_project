package com.revathiclass;

public class varstat {
	static String name="Static Variable";
	static int a=20, b=20;
	
	public static void multi() {
		System.out.println(name);
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		multi();
	}

}
