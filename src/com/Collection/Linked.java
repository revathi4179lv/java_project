package com.Collection;

import java.util.LinkedList;


public class Linked {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		
				//add
				l.add("Revathi");
				l.add("kavisha");
				l.add("Kirthika");
				l.add("hanvika");
				l.add("priya");
				l.add("lavi");
				System.out.println("added value is:"+ l);
				
				//size
				int size = l.size();
				System.out.println("length is:"+size);
				
				//get
				String gets = l.get(2);
				System.out.println("get value is:"+gets);
				
				//set
				l.set(2,"xyz");
				System.out.println("set value:"+l);
				
				//indexof
				int io = l.indexOf("priya");
				System.out.println("indexof value :"+io);
				
				//contains
				boolean cs = l.contains("kavisha");
				System.out.println("Contain value is:"+cs);
				
				//remove
				String re = l.remove(2);
				System.out.println("removed value is:"+re);
				System.out.println(l);
				
								
			
		
	}

}
