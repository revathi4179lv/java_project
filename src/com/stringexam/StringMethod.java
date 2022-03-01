package com.stringexam;

public class StringMethod {
public static void main(String[] args) {
	String s="string methods";
	
	//length
	int len = s.length();
	System.out.println("length is:"+len);
	
	//equals
	boolean equ = s.equals("String methods");
	System.out.println("equals is:"+equ);
	
	//equalsIgnoreCase
	boolean equIg = s.equalsIgnoreCase("String methods");
	System.out.println("equalsIgnoreCaseis:"+equIg);
	
	//toUpperCase
	String uc = s.toUpperCase();
	System.out.println("upper case is:"+uc);
	
	//toLowerCase
	String lc = s.toLowerCase();
	System.out.println("Lower Case is:"+lc);
	
	//startsWith
	boolean sr = s.startsWith("rin");
	System.out.println("startsWith is:"+sr);
	
	//endsWith
	boolean ed = s.endsWith("ds");
	System.out.println("endsWith is :"+ed);
	
	//indexOf
	int indexOf = s.indexOf("s");
	System.out.println("indexof is:"+indexOf);
	
	//lastIndexOf
	int lo = s.lastIndexOf("o");
	System.out.println("last indexOf value is:"+lo);

	//contains
	boolean contains = s.contains("a");
	System.out.println("contains is:"+contains);
	
	//substring
	String substring = s.substring(3);
	System.out.println("substring is :"+substring);
	
	String substring2 = s.substring(1, 10);
	System.out.println("substring2 is:"+substring2);
	
	//charAt
	char d = s.charAt(3);
	System.out.println("charAt is:"+d);

	//replace
	String r = s.replace("s","e");
	System.out.println("replace is:"+r);
	
	//isEmpty
	String s2="  ";
	String s3="";
	boolean empty = s2.isEmpty();
	boolean empty2 = s3.isEmpty();
	System.out.println("isEmpty is:"+empty);
	System.out.println("isEmpty1 is:"+empty2);
	
	//trim
	String s1="    string";
	String trim = s1.trim();
	System.out.println("trim is:"+trim);
	
	//split
	String[] split = s.split(" ");
	for (String st : split) {
	System.out.println(st);
		
	}
	
























}






































}
