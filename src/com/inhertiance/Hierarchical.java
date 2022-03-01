package com.inhertiance;

public class Hierarchical {
	public static void main(String[] args) {
		childHiera obj1 =new childHiera();
		childHiera1 obj2=new childHiera1();
		childHiera2 obj3=new childHiera2();
		
		obj1.show_p();
		obj1.show_c();
		
		obj2.show_p();
		obj2.show_c1();
		
		obj3.show_p();
		obj3.show_c3();
		
	}
}
