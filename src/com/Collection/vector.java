package com.Collection;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		List<Integer> c=new Vector<Integer>();
		List<Integer> c1=new Vector<Integer>();
		
				//add
				c.add(20);
				c.add(10);
				c.add(40);
				c.add(25);
				c.add(68);
				c.add(58);
				System.out.println("added value is:"+ c);
				
				//size
				int size = c.size();
				System.out.println("length is:"+size);
				
				//get
				Integer integer = c.get(2);
				System.out.println("get value is:"+integer);
				
				//set
				c.set(2,49);
				System.out.println("set value:"+c);
				
				//indexof
				int io = c.indexOf(25);
				System.out.println("indexof value :"+io);
				
				//contains
				boolean cs = c.contains(45);
				System.out.println("Contain value is:"+cs);
				
				//remove
				Integer re = c.remove(2);
				System.out.println("removed value is:"+re);
				System.out.println(c);
				
				c1.add(30);
				c1.add(15);
				c1.add(45);
				c1.add(45);
				c1.add(10);
				System.out.println(c1);
				
				/**add all
				c.addAll(c1);
				System.out.println("addall value is:"+c);**/
				
				//retainAll
				c.retainAll(c1);
				System.out.println("duplicate value is:"+c);
				
				//remove all
				c.removeAll(c1);
				System.out.println(c);
				
				//sort
				//Ascending order
				Collections.sort(c1);
				System.out.println("Ascending Order:"+c1);
				//descending
				Collections.sort(c1,Collections.reverseOrder());
				System.out.println("descending Order:"+c1);
				
				/**clear
				c1.clear();
				System.out.println(c1);
				System.out.println(c);**/
				
				//list
				for (Integer integer2 : c1) {
					System.out.println(integer2);
					
				}
				System.out.println(c);
				
				
				
				
				
				
				
				
				
				
				
 	}


}
