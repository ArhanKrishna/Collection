/*
 * PROGRAM OF SAMPLE DATA AND TO ILLUSTRATE toString(); compareTo(Object o)
 */

package com.collection;

import java.util.Comparator;

public class Passenger implements Comparable<Passenger>, Comparator<Passenger>{

	String name;
	int age;
	double price;
	
	Passenger(String name, int age, double price){
		this.name=name;
		this.age=age;
		this.price=price;
	}
	
	
	//TO PRINT ELEMENTS IN A PARTICULAR FORMAT AS REQUIRED
	@Override
	public String toString(){
		return String.format("\n Name : "+name+"\n Age : "+age+"\n Price : "+price+"\n");
	}

	
	//TO SORT OBJECTS IN A PARTICULAR ORDER BASED ON A SINGLE ELEMENT - AGE
	@Override
	public int compareTo(Passenger ps) {
		
		if(age==ps.age)
			return 0;
		else if(age>ps.age)
			return 1;
		else
			return -1;
			
	}

	//TO SORT OBJECTS IN A PARTICULAR ORDER BASED ON OTHER OBJECT'S ELEMENT - NAME
	@Override
	public int compare(Passenger pg1, Passenger pg2) {
		
		return pg1.name.compareToIgnoreCase(pg2.name);
	}
	
	
	
	
	
	
}
