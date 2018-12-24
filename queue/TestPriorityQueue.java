package com.collection.queue;

import java.util.PriorityQueue;

/*
 * SERIALIZABLE
 * DOES NOT ALLOW null
 * 
 */

public class TestPriorityQueue {
	
	public static void main(String[] args){
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		//queue.add(null);
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elements:");

		System.out.println(queue.toString());
		
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		
		System.out.println(queue.toString());
		
	}

}
