package com.revathiclass;

public class KeyThis {
	int a;
	int b;
	public void show(int a, int b) {
		this.a=a;
		this.b=b;
}
	public void set() {
		System.out.println("a value" +a);
		System.out.println("b value" +b);
	}	
public static void main(String[] args) {
	KeyThis k=new KeyThis();
	KeyThis k1=new KeyThis();
	k.show(2, 3);
	k1.show(5, 6);
	k.set();
	k1.set();
}
}
