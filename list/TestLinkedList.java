package com.collection.list;

import java.util.LinkedList;

public class TestLinkedList {

	
	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<String>();
	      
	      // add elements to the linked list
	      list.add("F");
	      list.add("B");
	      list.add("D");
	      list.add("E");
	      list.add("C");
	      list.addLast("Z");
	      list.addFirst("A");
	      list.add(1, "A2");
	      System.out.println("Original contents of list: \n" + list+"\n");

	      // remove elements from the linked list
	      list.remove("F");
	      list.remove(4);
	      System.out.println("Contents of list after deletion: \n" + list+"\n");
	      
	      // remove first and last elements
	      list.removeFirst();
	      list.removeLast();
	      System.out.println("list after deleting first and last: \n" + list+"\n");

	      // get and set a value
	      Object val = list.get(2);
	      list.set(2, (String) val + " Changed");
	      System.out.println("list after change: \n" + list+"\n");

		
	}

}
