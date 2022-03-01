package com.polymorphism;
//polymorphism
//method overloading
public class overloading {
	//method creation
	public void bank() {
		System.out.println("bank");
	}
	//data type
	public void bank(int accountno) { 
		System.out.println(accountno);

	}                                   
	//data type order
	public void bank(String name,String address, long phoneno ) {
		System.out.println(name+" "+address+" "+phoneno);

	}
	//data type count
	public void bank(int ifsc, long aadharnum, int pan ) {
		System.out.println(ifsc+" "+aadharnum+" "+pan);

	}
	public static void main(String[] args) {
		//object creation
		overloading b=new overloading();
		//method calling 
		b.bank();
		b.bank(45673456);
		b.bank("radha", "chennai", 9834328106L);
		b.bank(1234567, 345678901234L, 7689543 );
		
	}

}
