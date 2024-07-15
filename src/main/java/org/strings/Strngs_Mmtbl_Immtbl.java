package org.strings;

public class Strngs_Mmtbl_Immtbl {
	
	public static void main(String[] args) {
		
		// Im-Mutable strings are to concat 2 strings
			
			System.out.println("Immutable Strings:");
			
			String s1 = "java";
			System.out.println(System.identityHashCode(s1));
			
			String s2 = "Programming";
			System.out.println(System.identityHashCode(s2));
			
			s1 = s1.concat(s2);
			System.out.println(s1);
			
			System.out.println(System.identityHashCode(s1));
			
			
		// Mutable strings will append 1 strng to other and provide same mmry 
			// as the appended string mmry
			
			System.out.println("\nMutable Strings:");
			
			StringBuilder a1 = new StringBuilder("Git");
			System.out.println(System.identityHashCode(a1));
					
			StringBuilder a2 = new StringBuilder("Jenkins");
			System.out.println(System.identityHashCode(a2));
					
			a1 = a1.append(a2); //GitJenkins
			System.out.println(a1);
			
			System.out.println(System.identityHashCode(a1));
				
		}

}  // identityHashCode - static method -- classname.methodname()	
