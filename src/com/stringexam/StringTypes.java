package com.stringexam;

public class StringTypes {
	public static void main(String[] args) {
	//immutable 
		//duplicate value (literal string)
		String h="welcome";
		System.out.println(System.identityHashCode(h));
		String h1="welcome";
		System.out.println(System.identityHashCode(h1));
		
		//concatenation 
		System.out.println(System.identityHashCode(h+h1));
		System.out.println();
	
	//mutable
		//duplicate value
		StringBuffer j=new StringBuffer("Anna");
		System.out.println(System.identityHashCode(j));
		
		StringBuffer j1=new StringBuffer("Anna");
		System.out.println(System.identityHashCode(j1));
		System.out.println();
		
		StringBuilder b=new StringBuilder("hanvi");
		System.out.println(System.identityHashCode(b));
		
		StringBuilder b1=new StringBuilder("hanvi");
		System.out.println(System.identityHashCode(b1));
		System.out.println();
		
		//append
		System.out.println(System.identityHashCode(j.append(j1)));
		System.out.println();
	
		//non-literal
		String s=new String("gomathi");
		System.out.println(System.identityHashCode(s));
		
		String s1=new String("gomathi");
		System.out.println(System.identityHashCode(s1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
