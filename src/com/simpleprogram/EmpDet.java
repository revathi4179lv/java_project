package com.simpleprogram;

public class EmpDet {
	public void empId() {
		int id=12345;
		System.out.println("enter the id:"+id);

	}
	public void empName() {
		String name="aishu";
		System.out.println("enter the name:"+name);

	}
	public void empDob() {
		int dob=12-3-1900;
		System.out.println("enter the dob:"+dob);

	}
	public void empPhone() {
		long phone=9876543210l;
		System.out.println("enter the phone number:"+phone);

	}
	public void empMail() {
		String mail="aishu2356@gmail.com";
		System.out.println("enter the mail id:"+mail);

	}
	public void empAddress() {
		String Add="12, gandhi street, chennai";
		System.out.println("enter the address:"+Add);

	}
	public static void main(String[] args) {
		EmpDet e=new EmpDet();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empMail();
		e.empAddress();
	}














}

