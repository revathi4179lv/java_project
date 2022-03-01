package com.Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class List_example {
	public static void main(String[] args) {
		List<Integer> x= new ArrayList<Integer>();
		List<Integer> x1=new ArrayList<Integer>();
				
		//add
		x.add(20);
		x.add(10);
		x.add(40);
		x.add(25);
		x.add(68);
		x.add(58);
		System.out.println("added value is:"+ x);
		
		//size
		int size = x.size();
		System.out.println("length is:"+size);
		
		//get
		Integer integer = x.get(2);
		System.out.println("get value is:"+integer);
		
		
		//set
		x.set(2,49);
		System.out.println("set value:"+x);
		
		//indexof
		int io = x.indexOf(25);
		System.out.println("indexof value :"+io);
		
		//contains
		boolean cs = x.contains(45);
		System.out.println("Contain value is:"+cs);
		
		//remove
		Integer re = x.remove(2);
		System.out.println("removed value is:"+re);
		System.out.println(x);
		
		x1.add(30);
		x1.add(15);
		x1.add(45);
		x1.add(45);
		x1.add(10);
		System.out.println(x1);
		/**add all
		x.addAll(x1);
		System.out.println("addall value is:"+x);
		
		//retainAll
		x.retainAll(x1);
		System.out.println("duplicate value is:"+x);**/
		
		//remove all
		x.removeAll(x1);
		System.out.println(x);
		
		//sort
		//Ascending order
		Collections.sort(x1);
		System.out.println("Ascending Order:"+x1);
		//descending
		Collections.sort(x1,Collections.reverseOrder());
		System.out.println("descending Order:"+x1);
		
		//clear
		x1.clear();
		System.out.println(x1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
