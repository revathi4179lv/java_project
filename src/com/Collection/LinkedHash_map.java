package com.Collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHash_map {
public static void main(String[] args) {
	Map<Integer,String>m=new LinkedHashMap<>();
	//put
	m.put(20, "hash");
	m.put(45, "map");
	m.put(78, "Linked");
	m.put(90, "set");
	m.put(15, "tree");
	m.put(20, null);
	m.put(56, null);
	m.put(98, null);
	m.put(20, "mapp");
	System.out.println(m);
	//size
	int size = m.size();
	System.out.println("Length is:"+size);
	//get
	String get = m.get(20);
	System.out.println("key 20 of value is:"+get);
	//keyset
	Set<Integer> ks = m.keySet();
	System.out.println("key is:"+ks);
	//values
	Collection<String> vs = m.values();
	System.out.println("value is:"+vs);
	//containskey
	boolean ck = m.containsKey(20);
	System.out.println("containskey is:"+ck);
	//containsvalue
	boolean cv = m.containsValue(null);
	System.out.println("containsvalue is:"+cv);
	//entryset
	Set<Entry<Integer, String>> es = m.entrySet();
	System.out.println(es);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
