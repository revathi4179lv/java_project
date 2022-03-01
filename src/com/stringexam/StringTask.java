package com.stringexam;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
	// reverse
		String s="Hello";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		System.out.println();
		
		//equal
		Scanner r=new Scanner(System.in);
		String f = r.next();
		System.out.println("input is:"+f);
		boolean eus = f.equals("java");
		System.out.println("password correct"+eus);
		System.out.println();
		
		//contains
		Scanner g=new Scanner(System.in);
		String nx = g.next();
		System.out.println("the email id is:"+nx);
		boolean contains = nx.contains("@");
		System.out.println("valid email id :"+contains);
		System.out.println();
		
		//replace
		String j="welcome to java";
		System.out.println("the old is: welcome to java");
		String replaceAll = j.replaceAll("java", "sql");
		System.out.println("replace string is:"+replaceAll);
		System.out.println();
		
		String replaceAll2 = j.replaceAll(" ", "#");
		System.out.println("replace string1 is:"+replaceAll2);
		System.out.println();
		
		String k="welcome";
		String rep = k.replace("e", "@");
		System.out.println("replace word :"+rep);
		System.out.println();
		
		//toUpperCase
		String h="welcome";
		String upperCase = h.toUpperCase();
		System.out.println("capital Letter:"+upperCase);
		System.out.println();
	
	}

}
