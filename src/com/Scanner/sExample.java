package com.Scanner;

import java.util.Scanner;


public class sExample {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the studentId");
		int id = s.nextInt();
		System.out.println(id);
		
		System.out.println("enter the Student Name");
		String name = s.next();
		System.out.println(name);
		
		System.out.println("enter the mark1 :");
		int m1 = s.nextInt();
		System.out.println(m1);
		
		System.out.println("enter the mark2 :");
		int m2 = s.nextInt();
		System.out.println(m2);
	
		System.out.println("enter the mark3 :");
		int m3 = s.nextInt();
		System.out.println(m3);
		
		System.out.println("enter the mark4 :");
		int m4 = s.nextInt();
		System.out.println(m4);
		
		System.out.println("enter the mark5 :");
		int m5 = s.nextInt();
		System.out.println(m5);
		
		int sum=m1+m2+m3+m4+m5;
		System.out.println("the sum is      :"+sum);
		
		int avg=sum/5;
		System.out.println("the avgerage is :"+avg);
		
	}

}
