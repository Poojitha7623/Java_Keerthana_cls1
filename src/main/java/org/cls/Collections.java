package org.cls;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
	
	// collections -- coz suprts diff datatypes
	//arraylist var = new arraylist[] --// casting -- upcasting - small-->big
		
		// Arraylist li = new Anyone(Array/linked/Vector)();
		List li = new ArrayList();
		
		li.add(10);  //indx 0
		li.add("string"); //indx 1
		li.add(true);  //indx 2
		li.add(567.74356f); //indx 3
		li.add(null); //indx 4
		li.add(10); //indx 5
		
		System.out.println(li);	
		
	// add value in the middle	
	li.add(3, 55);
	System.out.println("\nadd index&value in middle:\n"+li);
	
	// remove value in the middle
	li.remove(3);
	System.out.println("\nRemove index&value in middle:\n"+li);
	

	// Remove method has return type as object also 
	// it can print the removed value
	Object remove = li.remove(3);
	System.out.println("\nRemove the value:\n"+remove);
	
	System.out.println("\nvalues in list:\n"+li);
	
	// set the value in preferred index 
	li.set(3, 543.234f);
	System.out.println("\nSet a value in the index:\n"+li);	
	
	// to know the length of the list indexs we use size method
	// size method has return type 'int'
	int size = li.size();
	System.out.println("\nsize of list:\n"+size);
	
	// to clear the complete list we use clear method
	li.clear();
	System.out.println("\nclear the list:\n"+li);
			
		
	}
}
