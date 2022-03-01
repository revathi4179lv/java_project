package com.stringexam;

public class stringTask1 {
	public static void main(String[] args) {
		String s="beginner book";
		int vcount = 0;
		int ccount=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vcount++;
			}
			else if (ch>='a'&& ch<='z') {
			ccount++;
				
			}
		}
		System.out.println("the vowels are:"+vcount);
		System.out.println("consonants are:"+ccount);
	}
}
