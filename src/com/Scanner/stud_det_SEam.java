package com.Scanner;

import java.util.Scanner;

public class stud_det_SEam {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		
		System.out.println("employee id :");
		int id = c.nextInt();
				
		System.out.println("employee name:");
		String n = c.next();
				
		System.out.println("employee emailid:");
		String em = c.next();
				
		System.out.println("employee phone number:");
		long num = c.nextLong();
		
		System.out.println("employee salary:");
		double salary = c.nextDouble();
				
		System.out.println("employee gender:");
		String gender = c.next();
				
		System.out.println("employee city:");
		String city = c.next();
				
		System.out.println("employee id         :" +id);
		System.out.println("employee name       :"+n);
		System.out.println("employee emailid    :"+em);
		System.out.println("employee phone number:"+num);
		System.out.println("employee salary      :"+salary);
		System.out.println("employee gender      :"+gender);
		System.out.println("employee city        :"+city);
		
		
	}

}
