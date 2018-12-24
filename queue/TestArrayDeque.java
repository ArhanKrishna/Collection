package com.collection.queue;

import java.util.ArrayDeque;


/*
 * DOES NOT ALLOW null
 */
public class TestArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<String> ade=new ArrayDeque<String>();
		
		//ade.add(null);
		ade.add("SAI");
		ade.add("SARAH");
		ade.add("SWATHI");
		
		System.out.println(ade.toString());
		
		ade.offerFirst("K");
		ade.addLast("B.Tech");
		
		System.out.println(ade.toString());
		
		ade.pollLast();
		
		System.out.println(ade.toString());
	}

}
