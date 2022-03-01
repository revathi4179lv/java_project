package com.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Exam {
	public static void main(String[] args) {
		Set<Object> s=new HashSet<>();
		Set<Object> s1=new HashSet<>();
		//add
		s.add(20);
		s.add(10);
		s.add("Revathi");
		s.add(25);
		s.add(null);
		s.add(null);
		System.out.println("added value is:"+ s);
		
		//size
		int size = s.size();
		System.out.println("length is:"+size);
		
		//get - didnt work
		//set - didnt work
		//indexof - didnt work
		
		//contains
		boolean cs = s.contains(45);
		System.out.println("Contain value is:"+cs);
		
		s1.add(30);
		s1.add(15);
		s1.add(45);
		s1.add(45);
		s1.add(10);
		System.out.println(s1);
		/**add all
		s.addAll(s1);
		System.out.println("addall value is:"+s);**/
		
		//retainAll
		s.retainAll(s1);
		System.out.println("duplicate value is:"+s);
		
		//remove - didnt work		
		
		for (Object object1 : s1) {
			System.out.println(" "+object1);
		}
		
		//Clear
		s.clear();
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
