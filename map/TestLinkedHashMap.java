package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;


/*
 * PRESERVES INSERTION ORDER
 * NOT ALLOW DUPLICATES
 * ONLY ONE null KEY IS ALLOWED
 */

public class TestLinkedHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new LinkedHashMap<Integer,String>();
		
		map.put(1,"Apple");
		map.put(3,"Citrus");
		map.put(2,"Banana");
		map.put(null, "Azone");
		map.put(null,"Asone");
		map.put(4,"Big");
		
		System.out.println(map.toString());
		
		map.remove(null);
		System.out.println(map.toString());

	}

}
