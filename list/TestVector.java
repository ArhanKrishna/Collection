package com.collection.list;

import java.util.Enumeration;
import java.util.Vector;

/*
 * SYNCHRONIZED
 */

public class TestVector {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<String>();
		vec.addElement("C");
		vec.add("JAVA");
		vec.add("C#");
				
		System.out.println("Size is: "+vec.size());
	    System.out.println("Default capacity increment is: "+vec.capacity());

	    vec.addElement("PYTHON");
	    vec.addElement("PERL");

	    /*size and capacityIncrement after two insertions*/
	    System.out.println("Size after addition: "+vec.size());
	    System.out.println("Capacity after increment is: "+vec.capacity());

	    //System.out.println(vec.toString());
	    /*Display Vector elements*/
	    Enumeration<String> en = vec.elements();
	    System.out.println("\nElements are:");
	    while(en.hasMoreElements())
	    	System.out.print(en.nextElement() + " ");
	   }

	}
	

