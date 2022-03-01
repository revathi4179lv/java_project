package com.Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash_set {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		Set<Object> s1=new LinkedHashSet<>();
				//add
				s.add(20);
				s.add(10);
				s.add(10);
				s.add(25);
				s.add(null);
				s.add(null);
				System.out.println("added value is:"+ s);
				
				//size
				int size = s.size();
				System.out.println("length is:"+size);
				
				//get
				//set
				//indexOf
				//contains
				boolean contains = s.contains(null);
				System.out.println(contains);
				s1.add(30);
				s1.add(15);
				s1.add("java");
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
