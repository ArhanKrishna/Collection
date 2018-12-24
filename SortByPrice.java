/*
 * SORT THE LIST BASED ON PRICE IN DESCENDING ORDER 
 */

package com.collection;

import java.util.Comparator;

public class SortByPrice implements Comparator<Passenger>{

	@Override
	public int compare(Passenger pg1, Passenger pg2) {
		
		if(pg1.price==pg2.price)
			return 0;
		else if(pg1.price>pg2.price)
			return -1;
		else
			return 1;
	}

}
