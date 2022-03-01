package com.Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {

		Map<Integer,String> m1=new Hashtable<>();
		
		m1.put(101, "siva");
		m1.put(102, "arun");
		m1.put(103, "raja");
		System.out.println(m1);
		Set<Entry<Integer, String>> entrySet = m1.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
