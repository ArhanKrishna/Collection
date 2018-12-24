package com.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * SET<<Interface>> --> DOES NOT ALLOW DUPLICATES
 * LINKEDHASHSET --> PRESERVES INSERTION ORDER
 * HASHSET --> ORDER BASED ON HASHING TECHNIQUE
 * TREESET --> ASCENDING ORDER --> WILL NOT ALLOW NULL VALUES
 * SORTEDSET<<Interface>> --> ONLY FOR TREESET
 */

public class TestSet {

	public static void main(String[] args) {
		
		//SortedSet<Integer> set=new TreeSet<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		//Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(12);
		set.add(254);
		set.add(123);
		set.add(47);
		set.add(12);
		set.add(47);
		set.add(null);
		
				
		System.out.println(set.toString());
		
	}

}
