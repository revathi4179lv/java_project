package com.array;

import java.util.ArrayList;
import java.util.List;

public class arrayTask {
	public static void main (String[] args) {  
    List<Integer> l=new ArrayList<>();
    //add
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(90);
    l.add(10);
    l.add(10);
    System.out.println(l);
    
  l.set(0,100);
   l.set(4,100);
   l.set(5,100);
   System.out.println(l);
   
   for (int i = 0; i < l.size(); i++) {
	   if (l.get(i)==10) {
		   System.out.println(100);
		   
		
	}
	   else {
		System.out.println(l.get(i));
	}
}
    
    
    
    
    
    
    
    
    
    
	}  

}
