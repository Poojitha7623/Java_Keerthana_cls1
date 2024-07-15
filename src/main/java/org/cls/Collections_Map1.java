package org.cls;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections_Map1 {
	
	public static void main(String[] args) {
		
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
		
		// To fetch only keys
		Set<String> keySet = mp.keySet();
		System.out.println("\nkeySet:\n"+keySet);
		
		System.out.println("\nEnhanced For Loop:");
		for (String string : keySet) {
			System.out.println(string);
		}
		
		// To fetch only values
		Collection<Integer> values = mp.values();
		System.out.println("\nvalues:\n"+values);
		
		System.out.println("\nEnhanced For Loop:");
		for (Integer integer : values) {
			System.out.println(integer);	
		}
		
		
		//Entry set -- iterate map
		
		Set<Entry<String, Integer>> entrySet = mp.entrySet();
		System.out.println("\nentrySet:\n"+entrySet);
		
		System.out.println("\nEnhanced For Loop:");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("\nGetKeys:");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
		}
		
		System.out.println("\nGetValues:");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		
	}

}
