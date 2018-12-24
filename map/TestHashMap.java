package com.collection.map;

import java.util.HashMap;
import java.util.Map;


/*
 * ORDER BASED ON HASHING OF KEY 
 * NOT ALLOW DUPLICATES
 * ONLY ONE null KEY IS ALLOWED
 */

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(1,"Apple");
		map.put(3,"Citrus");
		map.put(2,"Banana");
		map.put(null, "Azone");
		map.put(null,"Asone");
		map.put(4,"Big");
		
		for(Map.Entry<Integer, String> ent :map.entrySet()){
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}

	}

}
