/*
 * PROGRAM TO ILLUSTRATE ITERATOR WITH ARRAYLIST
 */
package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;


class Store{
	
	String name;
	int no;
	double price;
	
	Store(){
		
	}
	
	Store(String name, int no, double price){
		this.name=name;
		this.no=no;
		this.price=price;
	}
}


public class TestArrayList {

	public static void main(String[] args) {
		
		Store s1,s2,s3,s4;
		
		s1=new Store("Uppu",0012,42.375);
		s2=new Store("Pappu",0032,49.47);
		s3=new Store("Chinthapandu",0023,25.89);
		s4=new Store();
		
		ArrayList<Store> list=new ArrayList<Store>();
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("Items details :\n");
		
		Iterator<Store> itr=list.iterator();
		while(itr.hasNext()){
			Store str=itr.next();
			System.out.println("Item Name :"+str.name);
			System.out.println("Item No :"+str.no);
			System.out.println("Item Price :"+str.price+"\n");
			
		}
		System.out.println("No of Items :"+list.size()); 
	}

}
