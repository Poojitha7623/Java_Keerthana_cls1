package org.cls;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Colletions_Map {
public static void main(String[] args) {
	
	
	// Map<key,value> ref = new anyone(hash/linkedhash/tree/hashtable)<>();
	
			//Map<String, Integer> mp = new HashMap<>(); //- random
			//Map<String, Integer> mp = new LinkedHashMap<>(); //- insertion
			//Map<String, Integer> mp = new TreeMap<>(); //- ascending.. in key null(Exception) is not allowed 
			//Map<String, Integer> mp = new Hashtable<>(); //- random --  null(Exception) is not allowed in both key/value
			
	
	Map<String, Integer> mp = new LinkedHashMap<>();
	
	// Put() method of map
	
	System.out.println("Map Key&values:\n");
	mp.put("java", 92);
	mp.put("c", 98);
	mp.put("English", 96);
	mp.put(null, 92);
	mp.put("Tamil", 90);
	mp.put("Python", null);
	mp.put("English", 89);
	
	System.out.println(mp);
	
	// To know size of Map 
	
	int size = mp.size();
	System.out.println("\nSize of Map:\n"+size);
	
	//containsKey - to know specific key is prsnt or not 
	
	boolean containsKey = mp.containsKey("Hi");
	System.out.println("\ncontainsKey:\n"+containsKey);
	
	//contains value - to know specific Value is prsnt or not 
	
	boolean containsValue = mp.containsValue(89);
	System.out.println("\ncontainsValue:\n"+containsValue);
	
	//to remove a key 
	Integer remove = mp.remove("Tamil");
	System.out.println("\nRemoving Key:\n"+remove);	
	
	mp.remove("c");
	System.out.println("\nRemove:\n"+mp);
	
	//get()-- to fetch val by giving Key
	Integer integer = mp.get("Python");
	System.out.println("\ninteger:\n"+integer);
	
	// to know if Map is empty or not
	boolean empty = mp.isEmpty();
	System.out.println("\nempty:\n"+empty);
	
	// to clear
	mp.clear();
	System.out.println("\nClear Map:\n"+mp);
	
	// to know if Map is empty or not
		boolean empty1 = mp.isEmpty();
		System.out.println("\nIsempty:\n"+empty1);
	
	}

}
