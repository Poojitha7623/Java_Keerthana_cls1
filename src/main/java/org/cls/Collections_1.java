package org.cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collections_1 {
	
	public static void main(String[] args) {

		
		
	// Arraylist li = new Anyone(Array/linked/Vector)();	
	
		
      List li = new Vector();
		
		li.add(10);  //indx 0
		li.add("string"); //indx 1
		li.add(true);  //indx 2
		li.add(567.74356f); //indx 3
		li.add(null); //indx 4
		li.add(10); //indx 5
		
		System.out.println("\nvalues in list:\n"+li);
		
		
		
		
//		
//        List li = new ArrayList();
//		
//		li.add(10);  //indx 0
//		li.add("string"); //indx 1
//		li.add(true);  //indx 2
//		li.add(567.74356f); //indx 3
//		li.add(null); //indx 4
//		li.add(10); //indx 5
//		
//		System.out.println("\nvalues in list:\n"+li);
//		
//	// to verify the list is empty or not --// is empty has boolean as return type
////		li.isEmpty();
////		System.out.println("\nIs list empty?:\n"+li);
//		
//		boolean empty = li.isEmpty();
//		System.out.println("\nIs list empty?:\n"+empty);
//
//		
////		// to clear the complete list we use clear method
////		li.clear();
////		System.out.println("\nclear the list:\n"+li);
////		
////		// to verify the list is empty or not
////		boolean isempty = li.isEmpty();
////		System.out.println("\nIs list empty?:\n"+isempty);
////		
//		
//		// to know the index of the value -- return type int
//		int indexOf = li.indexOf("string");
//		System.out.println("\nIndex of the value:\n"+indexOf);
//		
//		// Contains is to know if the value is present in the list --// return type of boolean
//		
//		boolean contains = li.contains(55);
//		System.out.println("\nDoes value contains?:\n"+contains);
//		
//		boolean contains1 = li.contains(10);
//		System.out.println("\nDoes value contains?:\n"+contains1);
//		
//		// get method is to get value by using index --return type object
//		Object object = li.get(1);
//		System.out.println("\nGet the Value:\n"+object);
//	
	}

}
