package org.cls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Set {
	
	public static void main(String[] args) {

	

		// obj cretn -- Set ref = new anyone(hash/linkedhash/tree)[];
		//set creatn -- Set<Integer> ref =	new anyone(hash/linkedhash/tree)<>();
		//
		////Set<Integer> s = new HashSet<>(); //-- random
		////Set<Integer> s = new LinkedHashSet<>(); // insertion
		//Set<Integer> s = new TreeSet<>(); // ascending
		//
		//s.add(10); // if duplct given last value will b fetched
		//s.add(25);
		////s.add(null);
		//s.add(1);
		//
		//System.out.println(s);
		//
		//
		
		Set<String> s1 = new HashSet<>(); //-- random
		//Set<String> s1 = new LinkedHashSet<>(); // insertion
		//Set<String> s1 = new TreeSet<>(); // ascending
		
		s1.add("java"); 
		s1.add("Programming");
		s1.add(null);
		s1.add("true");
		s1.add("java"); 
		s1.add("String");
		
		System.out.println(s1);
		
		//To know the size of the set given
		int size = s1.size();
		System.out.println("\nsize of set:\n"+size);
		
		// to add the value to set
		s1.add("Selinium");
		System.out.println("\nadd value in middle:\n"+s1);
		
		// to know if set is empty
		boolean empty = s1.isEmpty();
		System.out.println("\nIs set empty?:\n"+empty);
		
//		// to clear the set 
//		s1.clear();
//		System.out.println("\nclear the set:\n"+s1);
	//	
//		// to know if set is empty
//		boolean empty1 = s1.isEmpty();
//		System.out.println("\nIs list empty?:\n"+empty1);
		
		
		// to know if values present in set 
		boolean contains = s1.contains("java");
		System.out.println("\nDoes value contains?:\n"+contains);
			
		// -- enhanced for loop	
		System.out.println("\nEnhanced For loop:");
			for (String string : s1) {
					System. out. println(string);
					}
			
	}

}

