package com.Collection;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<>();
		Set<Integer> s1=new TreeSet<>();
		//add
		s.add(50);
		s.add(60);
		s.add(30);
		s.add(25);
		s.add(20);
		s.add(70);
		System.out.println("added value is:"+ s);
		
		//size
		int size = s.size();
		System.out.println("length is:"+size);
		
		//get
		//set
		//indexOf
		
		//contains
		boolean contains = s.contains(45);
		System.out.println(contains);
		
		s1.add(30);
		s1.add(15);
		s1.add(12);
		s1.add(45);
		s1.add(10);
		System.out.println(s1);
		
		// add all
						
		//retainAll
		s.retainAll(s1);
		System.out.println("duplicate value is:"+s);
		
		//remove
		
		for (Object object1 : s1) {
			System.out.println(" "+object1);
		}
		
		//Clear
		s.clear();
	}

}
