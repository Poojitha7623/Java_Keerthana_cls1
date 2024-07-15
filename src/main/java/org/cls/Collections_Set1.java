package org.cls;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Set1 {

	
	public static void main(String[] args) {
		
		
	//Set<Integer> s = new HashSet<>(); //-- random
	Set<Integer> s = new LinkedHashSet<>(); // insertion
	//Set<Integer> s = new TreeSet<>(); // ascending
	
	s.add(10); // if duplct given last value will b fetched
	s.add(25);
	s.add(null); // treeset doesnot support
	s.add(100);
	s.add(15); 
	s.add(35);
	
	System.out.println(s);
	
		
	//Set<Integer> s1 = new HashSet<>(); //-- random
	Set<Integer> s1 = new LinkedHashSet<>(); // insertion
	//Set<Integer> s1 = new TreeSet<>(); // ascending
	
	s1.add(22); // if duplct given last value will b fetched
	s1.add(13);
	s1.add(10); 
	s1.add(25);
	s1.add(null);
	s1.add(55);
	
	System.out.println(s1);
	
	
	// to remove the common value from both interface
	
	s.removeAll(s1);
	System.out.println("\nRemoving the set values:\n"+s);
	
//	
//	// to print the  values not same in both interfaces
//	
//    s.retainAll(s1);  //   s1.retainAll(s);
//    System.out.println("\nRetaining set values:\n"+s);
	
	
//		// to add one set interface to other set
//		s.addAll(s1);
//	    System.out.println("\nAdding set:\n"+s);
	

//	// to know the equality of the 2 interfaces -- returntype is boolean
//	
//		boolean equals = s.equals(s1);
//		System.out.println("\nEqual values in set:\n"+equals);

	}
}
