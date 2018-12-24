/*
 * PROGRAM TO ILLUSTRATE Comparator ; Comparable & toString() 
 */

package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestFormats {

	public static void main(String[] args) {
		
		Passenger p1,p2,p3;
		
		p1=new Passenger("Lambu", 25, 1200);
		p2=new Passenger("Jambu", 23, 1350);
		p3=new Passenger("Tambu", 21, 1270);
		
		ArrayList<Passenger> list=new ArrayList<Passenger>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);

				
		Collections.sort(list);
		System.out.println("Comparable based on AGE -->");
		System.out.println("Passenger Details are :");
		System.out.println(list);
		
		System.out.println("\n\n");
		
		Collections.sort(list,new Passenger("Jambu",25,1200));
		System.out.println("Comparator based on NAME -->");
		System.out.println("Passenger Details are :");
		System.out.println(list);
		
		System.out.println("\n\n");
		
		Collections.sort(list,new SortByPrice());
		System.out.println("Comparator based on PRICE -->");
		System.out.println("Passenger Details are :");
		System.out.println(list);
		
		
	}

}
