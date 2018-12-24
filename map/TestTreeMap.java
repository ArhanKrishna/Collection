package com.collection.map;

import java.util.Map;
import java.util.TreeMap;


/*
 * PRESERVES IN ASCENDING ORDER
 * NOT ALLOW DUPLICATES
 * null KEY IS NOT ALLOWED FOR ATLEAST ONCE 
 */
public class TestTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new TreeMap<Integer,String>();
		
		map.put(1,"Apple");
		map.put(3,"Citrus");
		map.put(2,"Banana");
		map.put(5,"Guava");
		map.put(4,"Custard Apple");
		//map.put(null,"Asone");
		map.put(-1,"Big");
		
		System.out.println(map.toString());
		
		map.remove(2);
		System.out.println(map.toString());

	}

}
